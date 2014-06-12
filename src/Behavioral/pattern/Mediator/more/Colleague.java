/**
 * 
 */
package pattern.Mediator.more;

/**
 * 抽象同事类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-9
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
	 * 只和自己有关的动作
	 */
	public abstract void action();

	/**
	 * 自身状态改变，会和其他对象通信的动作 
	 * 应该委托给Mediator来实现和其他对象通信
	 */
	public abstract void change();
}