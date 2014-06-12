/**
 * 
 */
package pattern.Mediator.more;

/**
 * 同事管理器
 * <p>
 * 1，具体同事对象的创建
 * 在很多情况下，这些具体同事对象均是由一个对象创建的。
 * 这个对象也可以把调停者类作为内部类，更能增强系统的健壮性。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-9
 */
public class ClolleagueManager {
	
	private Colleague colleague1;
	private Colleague colleague2;

	private Mediator mediator;

	public ClolleagueManager() {
		this.mediator = new ConcreteMediator();
		this.colleague1 = new ConcreteColleague1(mediator);
		this.colleague2 = new ConcreteColleague2(mediator);
	}

	public void colleague1Action() {
		colleague1.action();
	}

	public void colleague1Changed() {
		colleague1.change();
	}

	public void colleague2Action() {
		colleague2.action();
	}

	public void colleague2Changed() {
		colleague2.change();
	}

	private class ConcreteMediator implements Mediator {

		@Override
		public void colleagueChanged(Colleague clolleague) {
			if (clolleague == colleague1) {// colleague1发来的消息
				System.out.println("colleague1 invokes colleague2.action()");
				colleague2.action();// 和colleague2的通信
			} else if (clolleague == colleague2) {// colleague2发来的消息
				System.out.println("colleague2 invokes colleague1.action()");
				colleague1.action();// 和colleague1的通信
			}
		}
	}
}