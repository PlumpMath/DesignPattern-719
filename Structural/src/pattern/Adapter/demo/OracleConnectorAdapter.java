/**
 * 
 */
package pattern.Adapter.demo;

/**
 * Oracle连接器适配器
 * <p>
 * 采用适配器模式使得DBManager能够使用OracleConnector
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-4
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
