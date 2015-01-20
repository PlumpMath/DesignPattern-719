/**
 * 
 */
package pattern.ChainOfResponsibility.demo;

/**
 * �ܾ���
 * <p>
 * ���崦���߽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-1
 */
public class GeneralManager extends Handler {

	public GeneralManager(Handler nextHandler) {
		super(nextHandler);
	}

	/**
	 * �ܾ���ֻ�ܴ����н�������������񽻸��¼�(�ϼ��쵼)����
	 * 
	 * @see pattern.ChainOfResponsibility.demo.Handler#handleRequest(pattern.ChainOfResponsibility.demo.Request)
	 */
	@Override
	public void handleRequest(Request request) {
		if (request == Request.RAISES) {
			System.out.println("�ܾ��� ��׼ " + request.getDescription());
		} else {
			getNextHandler().handleRequest(request);
		}
	}
}