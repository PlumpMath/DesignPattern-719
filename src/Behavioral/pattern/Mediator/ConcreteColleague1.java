/**
 * 
 */
package pattern.Mediator;

/**
 * ����ͬ�����ɫ
 * <p>
 * ���еľ���ͬ������ӳ���ͬ����̳ж�����
 * ÿһ������ͬ���඼��������Լ���С��Χ�ڵ���Ϊ������֪�����ڴ�Χ�ڵ�Ŀ�ġ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(ConcreteMediator mediator) {
		super(mediator);
		// ע�ᵽ��ͣ����
		mediator.setColleague1(this);
	}

	/**
	 * ֻ���Լ��йصĶ���
	 * 
	 * @see pattern.Mediator.Colleague#action()
	 */
	@Override
	public void action() {
		System.out.println("action in ConcreteColleague1.");
	}

	/**
	 * ����״̬�ı䣬�����������ͨ�ŵĶ�����ί�и�Mediator��ʵ�ֺ���������ͨ�š�
	 * 
	 * @see pattern.Mediator.Colleague#change()
	 */
	@Override
	public void change() {
		// �¼���ʶ�Ǻ͵�ͣ�ߵ�һ��Լ��
		getMediator().colleagueChanged("1");
	}
}