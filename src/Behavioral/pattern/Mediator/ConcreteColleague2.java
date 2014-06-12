/**
 * 
 */
package pattern.Mediator;

/**
 * ����ͬ�����ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(ConcreteMediator mediator) {
		super(mediator);
		mediator.setColleague2(this);
	}

	@Override
	public void action() {
		System.out.println("action in ConcreteColleague2.");
	}

	@Override
	public void change() {
		getMediator().colleagueChanged("2");
	}
}