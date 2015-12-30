/**
 * 
 */
package pattern.Mediator;

/**
 * 抽象同事类角色
 * <p>
 * 同事对象只知道调停者而不知道其余的同事对象。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-8
 */
public abstract class Colleague {

	// 每一个对象都仅知道调停者，而不知道其他的同事对象
	private Mediator mediator;

	/**
	 * 一个同事对象在创建之时就已经知道了调停者
	 * 
	 * @param mediator
	 *            调停者
	 */
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

	protected Mediator getMediator() {
		return mediator;
	}

	/**
	 * 只和自己有关的动作
	 */
	public abstract void action();

	/**
	 * 自身状态改变，会和其他对象通信的动作，应该委托给Mediator来实现和其他对象通信。
	 */
	public abstract void change();
}
