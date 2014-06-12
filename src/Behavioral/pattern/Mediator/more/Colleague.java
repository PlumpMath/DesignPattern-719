/**
 * 
 */
package pattern.Mediator.more;

/**
 * ����ͬ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-9
 */
public abstract class Colleague {
	
	private Mediator mediator;

	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

	protected Mediator getMediator() {
		return mediator;
	}

	/**
	 * ֻ���Լ��йصĶ���
	 */
	public abstract void action();

	/**
	 * ����״̬�ı䣬�����������ͨ�ŵĶ��� 
	 * Ӧ��ί�и�Mediator��ʵ�ֺ���������ͨ��
	 */
	public abstract void change();
}