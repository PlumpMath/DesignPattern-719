/**
 * 
 */
package pattern.Adapter.demo;

/**
 * ���ݿ��������ӿ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-4
 */
public interface DBConnector {

	public void connect();

	public void disconnect();
}