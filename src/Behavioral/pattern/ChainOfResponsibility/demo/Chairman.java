/**
 * 
 */
package pattern.ChainOfResponsibility.demo;

/**
 * ���³�
 * <p>
 * ���崦���߽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-1
 */
public class Chairman extends Handler {

	public Chairman() {
		super(null);
	}

	/**
	 * ���³��ܴ�����������
	 * 
	 * @see pattern.ChainOfResponsibility.demo.Handler#handleRequest(pattern.ChainOfResponsibility.demo.Request)
	 */
	@Override
	public void handleRequest(Request request) {
		System.out.println("���³� ��׼ " + request.getDescription());
	}
}