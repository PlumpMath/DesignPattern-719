/**
 * 
 */
package pattern.Mediator;

/**
 * 不使用Mediator模式的示例
 * <p>
 * Colleague1和Colleague2相互关联，相互持有对方的引用，形成环形依赖。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-8
 */
public class NotUsingMediator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Colleague1 colleague1 = new Colleague1();
		Colleague2 colleague2 = new Colleague2();
		colleague1.setColleague2(colleague2);
		colleague2.setColleague1(colleague1);
		colleague1.change();
		colleague2.change();
	}

	/**
	 * 同事类1
	 */
	private static class Colleague1 {

		private Colleague2 colleague2;// 关联同事类2

		private Colleague2 getColleague2() {
			return colleague2;
		}

		public void setColleague2(Colleague2 colleague2) {
			this.colleague2 = colleague2;
		}

		/**
		 * 只和自己有关的动作
		 */
		public void action() {
			System.out.println("action in ConcreteColleague1.");
		}

		/**
		 * 会和其他对象通信的动作
		 */
		public void change() {
			System.out.println("colleague1 invokes colleague2.action()");
			getColleague2().action();
		}
	}

	/**
	 * 同事类2
	 */
	private static class Colleague2 {

		private Colleague1 colleague1;// 关联同事类1

		private Colleague1 getColleague1() {
			return colleague1;
		}

		public void setColleague1(Colleague1 colleague1) {
			this.colleague1 = colleague1;
		}

		/**
		 * 只和自己有关的动作
		 */
		public void action() {
			System.out.println("action in ConcreteColleague2.");
		}

		/**
		 * 会和其他对象通信的动作
		 */
		public void change() {
			System.out.println("colleague2 invokes colleague1.action()");
			getColleague1().action();
		}
	}
}