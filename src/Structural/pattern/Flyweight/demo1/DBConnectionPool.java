/**
 * 
 */
package pattern.Flyweight.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据库连接池
 * <p>
 * 享元工厂角色
 * <p>
 * 因为数据库连接的代价比较高，所以系统只允许同时存在3个连接
 * 所有的应用程序共享使用这三个连接，可以有效减轻数据库压力。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-8-3
 */
public class DBConnectionPool {

	// 单例模式
	private static DBConnectionPool instance = new DBConnectionPool();

	private List<DBConnectionImpl> pool;

	private DBConnectionPool() {
		this.pool = new ArrayList<DBConnectionImpl>();
		initPool();
	}

	/**
	 * 初始化连接池，只允许3个连接
	 */
	private void initPool() {
		for (int i = 0; i < 3; i++) {
			pool.add(new DBConnectionImpl(i + 1));
		}
	}

	/**
	 * 外部应用程序使用此接口创建连接
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