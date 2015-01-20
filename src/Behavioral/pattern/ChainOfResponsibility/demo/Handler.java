/**
 * 
 */
package pattern.ChainOfResponsibility.demo;

/**
 * �����߻���
 * <p>
 * �������߽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-1
 */
public abstract class Handler {

	// ��һ��������
	private Handler nextHandler;

	/**
	 * @param nextHandler
	 *            ��һ��������
	 */
	public Handler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public Handler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	/**
	 * ��������
	 * 
	 * @param request
	 *            ����
	 */
	public abstract void handleRequest(Request request);
}