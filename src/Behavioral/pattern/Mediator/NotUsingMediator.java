/**
 * 
 */
package pattern.Mediator;

/**
 * ��ʹ��Mediatorģʽ��ʾ��
 * <p>
 * Colleague1��Colleague2�໥�������໥���жԷ������ã��γɻ���������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
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
	 * ͬ����1
	 */
	private static class Colleague1 {

		private Colleague2 colleague2;// ����ͬ����2

		private Colleague2 getColleague2() {
			return colleague2;
		}

		public void setColleague2(Colleague2 colleague2) {
			this.colleague2 = colleague2;
		}

		/**
		 * ֻ���Լ��йصĶ���
		 */
		public void action() {
			System.out.println("action in ConcreteColleague1.");
		}

		/**
		 * �����������ͨ�ŵĶ���
		 */
		public void change() {
			System.out.println("colleague1 invokes colleague2.action()");
			getColleague2().action();
		}
	}

	/**
	 * ͬ����2
	 */
	private static class Colleague2 {

		private Colleague1 colleague1;// ����ͬ����1

		private Colleague1 getColleague1() {
			return colleague1;
		}

		public void setColleague1(Colleague1 colleague1) {
			this.colleague1 = colleague1;
		}

		/**
		 * ֻ���Լ��йصĶ���
		 */
		public void action() {
			System.out.println("action in ConcreteColleague2.");
		}

		/**
		 * �����������ͨ�ŵĶ���
		 */
		public void change() {
			System.out.println("colleague2 invokes colleague1.action()");
			getColleague1().action();
		}
	}
}