/**
 * 
 */
package pattern.Facade;

/**
 * ʹ������ģʽʱ�Ŀͻ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-25
 */
public class ClientUsingFacade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Facade.getInstance().operationAll();
	}
}