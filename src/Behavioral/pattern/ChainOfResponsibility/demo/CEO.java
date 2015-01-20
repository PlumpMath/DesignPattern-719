/**
 * 
 */
package pattern.ChainOfResponsibility.demo;

/**
 * CEO
 * <p>
 * ���崦���߽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-1
 */
public class CEO extends Handler {

	public CEO(Handler nextHandler) {
		super(nextHandler);
	}

	/**
	 * CEOֻ�ܴ�������������������񽻸��¼�(�ϼ��쵼)����
	 * 
	 * @see pattern.ChainOfResponsibility.demo.Handler#handleRequest(pattern.ChainOfResponsibility.demo.Request)
	 */
	@Override
	public void handleRequest(Request request) {
		if (request == Request.PROMOTION) {
			System.out.println("CEO ��׼ " + request.getDescription());
		} else {
			getNextHandler().handleRequest(request);
		}
	}
}