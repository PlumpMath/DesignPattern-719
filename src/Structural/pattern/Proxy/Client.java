/**
 * 
 */
package pattern.Proxy;

/**
 * �ͻ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-20
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ֱ��ʹ�ô������
		Subject subject = new ProxySubject();
		subject.request();
	}
}