/**
 * 
 */
package pattern.Proxy.more;

/**
 * ��������(Smart Reference)������ʾ
 * <p>
 * ��һ����������ʱ���ṩһЩ����Ĳ��������罫�Դ˶�����õĴ�����¼������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-22
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
 * ���ݿ�������
 */
interface DBConnector {

	/**
	 * �������ݿ�
	 */
	public void connnect();
}

/**
 * Oracle���ݿ�������
 */
class OracleConnector implements DBConnector {

	public void connnect() {
		System.out.println("connect Oracle database.");
	}
}

/**
 * Oracle���ݿ���������������
 */
class OracleConnectorCounterProxy implements DBConnector {

	private OracleConnector connector;// ������������

	private int counter = 0;// ������

	public OracleConnectorCounterProxy() {
		// do nothing
	}

	private OracleConnector getConnector() {
		if (connector == null) {
			connector = new OracleConnector();
		}
		// ���������������������������3�Σ��򴴽��µ���������ͬʱ���ü�����
		if (counter >= 3) {
			System.out.println("over 3 times,so connector changed.");
			connector = new OracleConnector();
			counter = 0;
		}
		return connector;
	}

	/**
	 * �������ݿ�
	 */
	public void connnect() {
		getConnector().connnect();
		// ÿ�����Ӷ��Ὣ������+1
		counter++;
	}
}