/**
 * 
 */
package pattern.Mediator.more;

/**
 * ����ͬ����1
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-9
 */
public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void action() {
		System.out.println("action in ConcreteColleague1.");
	}

	@Override
	public void change() {
		/*
		 * 4��ͬ����������ͣ��ͨ��
		 * ͬ�¶�����Խ�������Ϊ����������ͣ�߶���ʹ�á�
		 */
		getMediator().colleagueChanged(this);
	}
}