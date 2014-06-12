/**
 * 
 */
package pattern.Multiton;

import java.util.ArrayList;
import java.util.List;

/**
 * 无上限多例类
 * <p>
 * 实例数目没有上限的多例模式就叫做无上限多例模式，
 * 由于事先不知道要创建多少个实例，因此必然使用聚集管理所有的实例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-11
 */
public class LimitlessMultiton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
}

/**
 * 数据库连接器
 * <p>
 * 由于要根据数据库所在机器的硬件配置才能决定
 * 提供多少数据库连接器，所以需要使用无上限多例模式
 */
class DBConnector {

	private static List<DBConnector> connectorPool;

	static {
		connectorPool = new ArrayList<DBConnector>();
		long memory = Runtime.getRuntime().totalMemory();
		// JVM内存小于10M则只提供5个连接器，否则10个
		int n = memory < (10 * 1024 * 1024) ? 5 : 10;
		for (int i = 0; i < n; i++) {
			connectorPool.add(new DBConnector());
		}
	}

	private boolean isInUse;// 是否正在被使用

	private DBConnector() {
	}

	/**
	 * 返回数据库连接器实例
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
	 * 连接数据库
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