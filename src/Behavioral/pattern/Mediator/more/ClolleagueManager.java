/**
 * 
 */
package pattern.Mediator.more;

/**
 * ͬ�¹�����
 * <p>
 * 1������ͬ�¶���Ĵ���
 * �ںܶ�����£���Щ����ͬ�¶��������һ�����󴴽��ġ�
 * �������Ҳ���԰ѵ�ͣ������Ϊ�ڲ��࣬������ǿϵͳ�Ľ�׳�ԡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-9
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
			if (clolleague == colleague1) {// colleague1��������Ϣ
				System.out.println("colleague1 invokes colleague2.action()");
				colleague2.action();// ��colleague2��ͨ��
			} else if (clolleague == colleague2) {// colleague2��������Ϣ
				System.out.println("colleague2 invokes colleague1.action()");
				colleague1.action();// ��colleague1��ͨ��
			}
		}
	}
}