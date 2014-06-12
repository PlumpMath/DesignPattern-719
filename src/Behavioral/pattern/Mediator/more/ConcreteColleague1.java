/**
 * 
 */
package pattern.Mediator.more;

/**
 * 具体同事类1
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-9
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
		 * 4，同事类如何与调停者通信
		 * 同事对象可以将自身作为参量传给调停者对象使用。
		 */
		getMediator().colleagueChanged(this);
	}
}