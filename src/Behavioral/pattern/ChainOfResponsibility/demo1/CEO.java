/**
 * 
 */
package pattern.ChainOfResponsibility.demo1;

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
	 * @see pattern.ChainOfResponsibility.demo1.Handler#handleRequest(pattern.ChainOfResponsibility.demo1.Request)
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