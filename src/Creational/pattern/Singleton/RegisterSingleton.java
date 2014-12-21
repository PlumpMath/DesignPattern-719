/**
 * 
 */
package pattern.Singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * �Ǽ�ʽ������
 * <p>
 * �Ǽ�ʽ��������Ϊ�˿˷�����ʽ������ʽ�����಻�ɼ̳е�ȱ�����Ƶ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-9
 */
public class RegisterSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DBManager.getInstance("").connect();
		DBManager.getInstance("Oracle").connect();
		DBManager.getInstance("oracle").connect();
		DBManager.getInstance("db2").connect();
		DBManager.getInstance("Db2").connect();
		DBManager.getInstance("sqlserver").connect();
		DBManager.getInstance("Sqlserver").connect();
	}
}

abstract class DBManager {

	// ʹ��һ��Map����ŵǼǺ��DBManagerʵ��
	private static Map<String, DBManager> instanceMap = new HashMap<String, DBManager>();

	/**
	 * ����Ĺ��췽�������ǹ����ģ�Ҳ����������Ե��õġ�
	 * ����һ���������˿���ֱ��ʹ�����๹�췽������ʵ�������ڸ���ĵǼ��С�
	 * ���ڸ����ʵ��������ڲſ����������ʵ����������Щ�������һ���˷ѡ�
	 */
	protected DBManager() {
	}

	public static DBManager getInstance(String name) {
		String classname = null;
		if ("oracle".equalsIgnoreCase(name)) {
			classname = OracleManager.class.getName();
		} else if ("sqlserver".equalsIgnoreCase(name)) {
			classname = SQLServerManager.class.getName();
		} else if ("db2".equalsIgnoreCase(name)) {
			classname = DB2Manager.class.getName();
		} else {
			classname = OracleManager.class.getName();
		}
		DBManager instance = instanceMap.get(classname);
		if (instance == null) {
			try {
				instance = (DBManager) Class.forName(classname).newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
			instanceMap.put(classname, instance);
		}
		return instanceMap.get(classname);
	}

	public abstract void connect();
}

class OracleManager extends DBManager {

	public void connect() {
		System.out.println(this + " connect Oracle Database......");
	}
}

class SQLServerManager extends DBManager {

	public void connect() {
		System.out.println(this + " connect SQLServer Database......");
	}
}

class DB2Manager extends DBManager {

	public void connect() {
		System.out.println(this + " connect DB2 Database......");
	}
}