/**
 * 
 */
package pattern.FactoryMethod.more;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品对象的循环使用和登记式的工厂方法
 * <p>
 * 工厂方法所做的事情可以相当复杂，常见的复杂逻辑是循环使用产品对象。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-26
 */
public class ProductRegister {

}

class WCClient {

	private static WCFactory maleWCFactory;
	private static WCFactory femaleWCFactory;
	
	static void consume() {
		maleWCFactory = new MaleWCFactory();
		maleWCFactory.factory();
		maleWCFactory.factory();
		maleWCFactory.factory();
		femaleWCFactory = new FemaleWCFactory();
		femaleWCFactory.factory();
		femaleWCFactory.factory();
		femaleWCFactory.factory();
	}
}

interface WCFactory {

	public WC factory();
}
/**
 * 如果产品对象可以由内部状态表征的话，那么对于每一个可能的内部状态，往往仅需要一个产品实例。
 * 这时候工厂对象就需要将已经创建过的产品对象登记到一个聚集里面，
 * 然后根据客户端所请求的产品状态，向聚集进行查询。
 * 如果聚集中有这样的产品对象，那么就直接将这个产品对象返还给客户端；
 * 如果聚集中没有这样的产品对象，那么就创建一个新的满足要求的产品对象，
 * 然后将这个对象登记到聚集中，再返还给客户端。
 * */
class MaleWCFactory implements WCFactory {

	private static List<WC> MALE_WC_LIST = new ArrayList<WC>();

	static {
		// 只提供5个男厕所
		for (int i = 0; i < 5; i++) {
			MALE_WC_LIST.add(new MaleWC());
		}
	}

	public WC factory() {
		for (WC wc : MALE_WC_LIST) {
			if (!wc.isInUse()) {
				return wc;
			}
		}
		throw new RuntimeException("All Male WC are in use.");
	}
}

class FemaleWCFactory implements WCFactory {

	private static List<WC> FEMALE_WC = new ArrayList<WC>();

	static {
		//只提供10个女厕所
		for (int i = 0; i < 10; i++) {
			FEMALE_WC.add(new FemaleWC());
		}
	}

	public WC factory() {
		for (WC wc : FEMALE_WC) {
			if (!wc.isInUse()) {
				return wc;
			}
		}
		throw new RuntimeException("All Female WC are in use.");
	}
}

interface WC {

	public boolean isInUse();

	public void enter();
}

abstract class AbstractWC implements WC {

	private boolean inUse;

	public boolean isInUse() {
		return inUse;
	}

	public void enter() {
		inUse = true;
	}
}

class MaleWC extends AbstractWC {

	public void enter() {
		super.enter();
		System.out.println("This is Male WC.");
	}
}

class FemaleWC extends AbstractWC {

	public void enter() {
		super.enter();
		System.out.println("This is Female WC.");
	}
}