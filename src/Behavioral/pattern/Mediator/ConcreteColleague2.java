/**
 * 
 */
package pattern.Mediator;

/**
 * 具体同事类角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-8
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