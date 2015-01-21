/**
 * 
 */
package pattern.Mediator;

/**
 * 具体同事类角色
 * <p>
 * 所有的具体同事类均从抽象同事类继承而来。
 * 每一个具体同事类都很清楚它自己在小范围内的行为，而不知道它在大范围内的目的。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-8
 */
public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(ConcreteMediator mediator) {
		super(mediator);
		// 注册到调停者中
		mediator.setColleague1(this);
	}

	/**
	 * 只和自己有关的动作
	 * 
	 * @see pattern.Mediator.Colleague#action()
	 */
	@Override
	public void action() {
		System.out.println("action in ConcreteColleague1.");
	}

	/**
	 * 自身状态改变，会和其他对象通信的动作，委托给Mediator来实现和其他对象通信。
	 * 
	 * @see pattern.Mediator.Colleague#change()
	 */
	@Override
	public void change() {
		// 事件标识是和调停者的一个约定
		getMediator().colleagueChanged("1");
	}
}