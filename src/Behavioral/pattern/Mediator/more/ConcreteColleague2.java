/**
 * 
 */
package pattern.Mediator.more;

/**
 * 具体同事类2
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-9
 */
public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void action() {
		System.out.println("action in ConcreteColleague2.");
	}

	@Override
	public void change() {
		getMediator().colleagueChanged(this);
	}
}