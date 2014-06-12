/**
 * 
 */
package pattern.Adapter.demo;

/**
 * ���ݿ������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-4
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