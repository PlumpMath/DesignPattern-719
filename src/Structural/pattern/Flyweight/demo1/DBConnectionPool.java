/**
 * 
 */
package pattern.Flyweight.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * ���ݿ����ӳ�
 * <p>
 * ��Ԫ������ɫ
 * <p>
 * ��Ϊ���ݿ����ӵĴ��۱Ƚϸߣ�����ϵͳֻ����ͬʱ����3�����ӡ�
 * ���е�Ӧ�ó�����ʹ�����������ӣ�������Ч�������ݿ�ѹ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-8-3
 */
public class DBConnectionPool {

	// ����ģʽ
	private static DBConnectionPool instance = new DBConnectionPool();

	private List<DBConnectionImpl> pool;

	private DBConnectionPool() {
		this.pool = new ArrayList<DBConnectionImpl>();
		initPool();
	}

	/**
	 * ��ʼ�����ӳأ�ֻ����3������
	 */
	private void initPool() {
		for (int i = 0; i < 3; i++) {
			pool.add(new DBConnectionImpl(i + 1));
		}
	}

	/**
	 * �ⲿӦ�ó���ʹ�ô˽ӿڴ�������
	 */
	public synchronized DBConnection createConnection() {
		for (DBConnectionImpl connection : pool) {
			if (!connection.isInUse()) {
				return connection;
			}
		}
		throw new RuntimeException("All connections are in use.");
	}

	public static DBConnectionPool getInstance() {
		return instance;
	}
}