/**
 * 
 */
package pattern.Proxy;

/**
 * ��ʵ�����ɫ
 * <p>
 * �����˴��������ɫ���������ʵ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-20
 */
public class RealSubject implements Subject {

	public RealSubject() {
		// do nothing
	}
	
	/**
	 * ��ʵ�����е�request()����
	 */
	@Override
	public void request() {
		System.out.println("RealSubject.request()");
	}
}