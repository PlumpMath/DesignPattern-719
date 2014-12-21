/**
 * 
 */
package pattern.Singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 登记式单例类
 * <p>
 * 登记式单例类是为了克服饿汉式和懒汉式单例类不可继承的缺点而设计的
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-9
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

	// 使用一个Map来存放登记后的DBManager实例
	private static Map<String, DBManager> instanceMap = new HashMap<String, DBManager>();

	/**
	 * 父类的构造方法必须是公开的，也就是子类可以调用的。
	 * 这样一来就允许了可以直接使用子类构造方法创建实例而不在父类的登记中。
	 * 由于父类的实例必须存在才可能有子类的实例，这在有些情况下是一个浪费。
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