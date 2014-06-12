/**
 * 
 */
package pattern.Adapter.demo;

/**
 * 数据库管理器
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-4
 */
public class DBManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OracleConnector oc = new OracleConnector();
		DBConnector connector = new OracleConnectorAdapter(oc);
		testConnection(connector);
	}

	private static void testConnection(DBConnector connector) {
		connector.connect();
		connector.disconnect();
	}
}