/**
 * 
 */
package pattern.ChainOfResponsibility.demo1;

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
	 * @see pattern.ChainOfResponsibility.demo1.Handler#handleRequest(pattern.ChainOfResponsibility.demo1.Request)
	 */
	@Override
	public void handleRequest(Request request) {
		System.out.println("���³� ��׼ " + request.getDescription());
	}
}