/**
 * 
 */
package pattern.ChainOfResponsibility;

/**
 * ���崦����(ConcreteHandler)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-1
 */
public class ConcreteHandlerB extends Handler {

	/**
	 * ������¼Ҿʹ��ݸ��¼Ҵ��������Լ�����
	 * 
	 * @see pattern.ChainOfResponsibility.Handler#handleRequest()
	 */
	@Override
	public void handleRequest() {
		if (getNext() == null) {
			System.out.println("The request is handled in ConcreteHandlerB.");
		} else {
			System.out.println("The request is passed to next Handler.");
			getNext().handleRequest();
		}
	}
}