/**
 * 
 */
package pattern.Multiton;

import java.util.ArrayList;
import java.util.List;

/**
 * �����޶�����
 * <p>
 * ʵ����Ŀû�����޵Ķ���ģʽ�ͽ��������޶���ģʽ��
 * �������Ȳ�֪��Ҫ�������ٸ�ʵ������˱�Ȼʹ�þۼ��������е�ʵ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-11
 */
public class LimitlessMultiton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
}

/**
 * ���ݿ�������
 * <p>
 * ����Ҫ�������ݿ����ڻ�����Ӳ�����ò��ܾ���
 * �ṩ�������ݿ���������������Ҫʹ�������޶���ģʽ
 */
class DBConnector {

	private static List<DBConnector> connectorPool;

	static {
		connectorPool = new ArrayList<DBConnector>();
		long memory = Runtime.getRuntime().totalMemory();
		// JVM�ڴ�С��10M��ֻ�ṩ5��������������10��
		int n = memory < (10 * 1024 * 1024) ? 5 : 10;
		for (int i = 0; i < n; i++) {
			connectorPool.add(new DBConnector());
		}
	}

	private boolean isInUse;// �Ƿ����ڱ�ʹ��

	private DBConnector() {
	}

	/**
	 * �������ݿ�������ʵ��
	 */
	public static DBConnector getInstance() {
		for (DBConnector connector : connectorPool) {
			if(!connector.isInUse){
				return connector;
			}
		}
		return null;
	}

	/**
	 * �������ݿ�
	 */
	public void connect() {
		isInUse = true;
		try {
			Thread.sleep(1000);
			System.out.println(" connect to DB ... ...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			isInUse = false;
		}
	}
}