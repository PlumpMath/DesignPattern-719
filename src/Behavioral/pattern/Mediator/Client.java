/**
 * 
 */
package pattern.Mediator;

/**
 * �ͻ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		Colleague colleague1 = new ConcreteColleague1(mediator);
		Colleague colleague2 = new ConcreteColleague2(mediator);
		colleague1.change();
		colleague2.change();
	}

}
