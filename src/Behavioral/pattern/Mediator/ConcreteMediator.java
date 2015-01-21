/**
 * 
 */
package pattern.Mediator;

/**
 * 具体调停者角色
 * <p>
 * 从抽象调停者继承而来，实现了抽象超类所声明的事件方法。
 * 具体调停者类知晓所有的具体同事类，它从具体同事对象接收消息、向具体同事对象发出消息。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-8
 */
public class ConcreteMediator implements Mediator {

	// 调停者负责协调的两个(可以更多)具体同事对象，本例只负责这两个对象的调停
	private ConcreteColleague1 colleague1;
	private ConcreteColleague2 colleague2;

	private ConcreteColleague1 getColleague1() {
		return colleague1;
	}

	public void setColleague1(ConcreteColleague1 colleague1) {
		this.colleague1 = colleague1;
	}

	private ConcreteColleague2 getColleague2() {
		return colleague2;
	}

	public void setColleague2(ConcreteColleague2 colleague2) {
		this.colleague2 = colleague2;
	}

	/**
	 * 事件方法的实现
	 *
	 * @see pattern.Mediator.Mediator#colleagueChanged(java.lang.String)
	 */
	@Override
	public void colleagueChanged(String id) {
		if ("1".equals(id)) {// colleague1发来的消息
			System.out.println("colleague1 invokes colleague2.action()");
			getColleague2().action();// 和colleague2的通信
		} else if ("2".equals(id)) {// colleague2发来的消息
			System.out.println("colleague2 invokes colleague1.action()");
			getColleague1().action();// 和colleague1的通信
		}
	}
}