/**
 * 
 */
package pattern.ChainOfResponsibility.demo;

/**
 * ���ž���
 * <p>
 * ���崦���߽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-1
 */
public class DeptManager extends Handler {

	public DeptManager(Handler nextHandler) {
		super(nextHandler);
	}

	/**
	 * ���ž���ֻ�ܴ�������������������񽻸��¼�(�ϼ��쵼)����
	 * 
	 * @see pattern.ChainOfResponsibility.demo.Handler#handleRequest(pattern.ChainOfResponsibility.demo.Request)
	 */
	@Override
	public void handleRequest(Request request) {
		if (request == Request.LEAVE) {
			System.out.println("���ž��� ��׼ " + request.getDescription());
		} else {
			getNextHandler().handleRequest(request);
		}
	}
}