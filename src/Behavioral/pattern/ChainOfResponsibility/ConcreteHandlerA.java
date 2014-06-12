/**
 * 
 */
package pattern.ChainOfResponsibility;

/**
 * ���崦����(ConcreteHandler)��ɫ
 * <p>
 * ���崦���߽ӵ�����󣬿���ѡ��������������߽����󴫸��¼ҡ�
 * ���ھ��崦���߳��ж��¼ҵ����ã���ˣ������Ҫ�����崦���߿��Է����¼ҡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-1
 */
public class ConcreteHandlerA extends Handler {

	/**
	 * ������¼Ҿʹ��ݸ��¼Ҵ��������Լ�����
	 *
	 * @see pattern.ChainOfResponsibility.Handler#handleRequest()
	 */
	@Override
	public void handleRequest() {
		if (getNext() == null) {
			System.out.println("The request is handled in ConcreteHandlerA.");
		} else {
			System.out.println("The request is passed to next Handler.");
			getNext().handleRequest();
		}
	}
}