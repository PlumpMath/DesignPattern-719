/**
 * 
 */
package pattern.ChainOfResponsibility;

/**
 * ��������(Handler)��ɫ
 * <p>
 * ����ɫ�����һ����������Ľӿڡ�
 * �����Ҫ���ӿڿ��Զ����һ�����������趨�ͷ��ض��¼ҵ����á�
 * �����ɫͨ����һ��Java���������Java�ӿ�ʵ�֡�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-1
 */
public abstract class Handler {

	// ���¼�Handler������
	private Handler next;

	public Handler getNext() {
		return next;
	}

	/**
	 * �����¼�
	 */
	public void setNext(Handler next) {
		this.next = next;
	}

	/**
	 * ��������Ĳ���
	 */
	public abstract void handleRequest();
}