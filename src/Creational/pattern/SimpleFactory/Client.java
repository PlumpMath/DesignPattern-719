/**
 * 
 */
package pattern.SimpleFactory;

/**
 * �ͻ��˳�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-24
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Product product = Factory.create();
		System.out.println(product);
	}
}