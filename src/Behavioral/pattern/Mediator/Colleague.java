/**
 * 
 */
package pattern.Mediator;

/**
 * ����ͬ�����ɫ
 * <p>
 * ͬ�¶���ֻ֪����ͣ�߶���֪�������ͬ�¶���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public abstract class Colleague {

	// ÿһ�����󶼽�֪����ͣ�ߣ�����֪��������ͬ�¶���
	private Mediator mediator;

	/**
	 * һ��ͬ�¶����ڴ���֮ʱ���Ѿ�֪���˵�ͣ��
	 * 
	 * @param mediator
	 *            ��ͣ��
	 */
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
	 * ����״̬�ı䣬�����������ͨ�ŵĶ�����Ӧ��ί�и�Mediator��ʵ�ֺ���������ͨ�š�
	 */
	public abstract void change();
}