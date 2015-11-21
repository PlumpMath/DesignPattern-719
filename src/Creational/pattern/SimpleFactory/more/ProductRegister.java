/**
 * 
 */
package pattern.SimpleFactory.more;

/**
 * 产品对象的循环使用和登记式的工厂方法
 * <p>
 * 在前面的程序示例中工厂方法总是简单地调用产品类的构造方法创建出一个新的实例，
 * 然后将这个实例提供给客户端，而在实际情形中工厂方法所做的事情可以相当复杂。
 * <p>
 * 单例模式和多例模式是建立在简单工厂模式的基础之上的，
 * 而且它们都要求工厂方法具有特殊的逻辑，以便能循环使用产品的实例。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-26
 */
public class ProductRegister {

}

class WCClient {

	static void consume() {
		WCFactory.factory("male");
		WCFactory.factory("female");
		WCFactory.factory("3male");
	}
}
/**
 * 在很多情况下，产品对象可以循环使用。
 * 工厂方法可以循环使用已经创建出来的对象，而不是每一次都创建新的产品对象。
 * 工厂方法可以通过登记它所创建的产品对象来达到循环使用产品对象的目的。
 */
class WCFactory {

	private static WC MALE_WC = new MaleWC();
	private static WC FEMALE_WC = new FemaleWC();

	static WC factory(String sex) {
		if ("male".equalsIgnoreCase(sex)) {
			return MALE_WC;
		} else if ("female".equalsIgnoreCase(sex)) {
			return FEMALE_WC;
		} else {
			throw new RuntimeException("Is there another sex?");
		}
	}
}

interface WC {

	public void enter();
}

class MaleWC implements WC {

	public void enter() {
		System.out.println("This is Male WC.");
	}
}

class FemaleWC implements WC {

	public void enter() {
		System.out.println("This is Female WC.");
	}
}
