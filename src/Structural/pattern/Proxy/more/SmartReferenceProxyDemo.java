/**
 * 
 */
package pattern.Proxy.more;

/**
 * 智能引用(Smart Reference)代理演示
 * <p>
 * 当一个对象被引用时，提供一些额外的操作，比如将对此对象调用的次数记录下来。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-22
 */
public class SmartReferenceProxyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DBConnector connector = new OracleConnectorCounterProxy();
		for (int i = 0; i < 7; i++) {
			connector.connnect();
		}
	}
}

/**
 * 数据库连接器
 */
interface DBConnector {

	/**
	 * 连接数据库
	 */
	public void connnect();
}

/**
 * Oracle数据库连接器
 */
class OracleConnector implements DBConnector {

	public void connnect() {
		System.out.println("connect Oracle database.");
	}
}

/**
 * Oracle数据库连接器计数代理
 */
class OracleConnectorCounterProxy implements DBConnector {

	private OracleConnector connector;// 真正的连接器

	private int counter = 0;// 计数器

	public OracleConnectorCounterProxy() {
		// do nothing
	}

	private OracleConnector getConnector() {
		if (connector == null) {
			connector = new OracleConnector();
		}
		// 控制连接器的连接数，如果超过3次，则创建新的连接器，同时重置计数器
		if (counter >= 3) {
			System.out.println("over 3 times,so connector changed.");
			connector = new OracleConnector();
			counter = 0;
		}
		return connector;
	}

	/**
	 * 连接数据库
	 */
	public void connnect() {
		getConnector().connnect();
		// 每次连接都会将计数器+1
		counter++;
	}
}
