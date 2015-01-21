/**
 * 
 */
package pattern.Mediator;

/**
 * 客户端类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-8
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
