/**
 * 
 */
package pattern.Adapter.demo;

/**
 * Oracle������������
 * <p>
 * ����������ģʽʹ��DBManager�ܹ�ʹ��OracleConnector
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-4
 */
public class OracleConnectorAdapter implements DBConnector {

	private OracleConnector oc;

	public OracleConnectorAdapter(OracleConnector oc) {
		this.oc = oc;
	}

	public void connect() {
		oc.open();
	}

	public void disconnect() {
		oc.close();
	}
}