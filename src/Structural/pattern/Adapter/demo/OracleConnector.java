/**
 * 
 */
package pattern.Adapter.demo;

/**
 * Oracle���ݿ�������
 * <p>
 * ���������ʵ��������Oracle�ṩ�ģ���������Դ���ǲ������޸ĵ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-4
 */
public class OracleConnector {

	/**
	 * �����ݿ�
	 */
	public void open(){
		System.out.println("Open Oracle Database...");
	}
	
	/**
	 * �ر����ݿ�
	 */
	public void close(){
		System.out.println("Close Oracle Database...");
	}
}