/**
 * 
 */
package pattern.Bridge.demo2;

import java.util.Arrays;
import java.util.List;

/**
 * 使用桥梁模式实现的咖啡机
 * <p>
 * 这种实现方式不仅具有装饰模式的优点：减少了子类数量，并且易于扩展。
 * 比如以后新增加一个咖啡品种，只需要增加一个新的修正抽象角色即可；新增加一个咖啡添加物，只需要增加一个新的具体实现化角色即可。
 * 还克服了它的的缺点：3，不易修改和维护：比如Coffee接口中要增加一个新的方法，不会导致众多子类都必须进行修改。
 * 只需要修改Coffee继承体系中的相关子类即可，而CoffeeAccretion继承体系则无需任何变动；
 * 同样的，如果CoffeeAccretion继承体系需要修改(新增某个方法)，Coffee继承体系也无需变动。
 * 这两个继承体系的变动都是相互独立的，不会影响到另一端。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-27
 */
public class CoffeeMachineUsingBridge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 顾客定制各种各样的咖啡，只需要手工添加各种添加物即可
		new MexicanCoffee().printOrder();
		new VietnameseCoffee().printOrder();
		new MexicanCoffee(new Milk()).printOrder();
		new MexicanCoffee(new Sugar()).printOrder();
		new VietnameseCoffee(new Milk()).printOrder();
		new VietnameseCoffee(new Sugar()).printOrder();
		new MexicanCoffee(
				new CoffeeAccretion[] { new Sugar(), new Milk() }).printOrder();
		new VietnameseCoffee(
				new CoffeeAccretion[] { new Milk(), new Sugar() }).printOrder();
	}

	static interface Coffee {

		/**
		 * 名称
		 */
		public String getName();

		/**
		 * 价格
		 */
		public double getPrice();

		/**
		 * 打印出订单信息
		 */
		public void printOrder();
	}

	/**
	 * Abstraction角色
	 */
	static abstract class AbstractCoffee implements Coffee {

		// 咖啡添加物列表
		private List<CoffeeAccretion> accretions;

		public AbstractCoffee(CoffeeAccretion... accretions) {
			this.accretions = Arrays.asList(accretions);
		}

		public List<CoffeeAccretion> getAccretions() {
			return accretions;
		}

		public void setAccretions(List<CoffeeAccretion> accretions) {
			this.accretions = accretions;
		}

		@Override
		public String getName() {
			if (getAccretions() == null) return "";
			StringBuilder sb = new StringBuilder();
			// 委派到各个CoffeeAccretion对象中
			for (CoffeeAccretion accretion : getAccretions()) {
				sb.append("加");
				sb.append(accretion.name());
			}
			return sb.toString();
		}

		@Override
		public double getPrice() {
			if (getAccretions() == null) return 0;
			double price = 0;
			// 委派到各个CoffeeAccretion对象中
			for (CoffeeAccretion accretion : getAccretions()) {
				price += accretion.price();
			}
			return price;
		}

		/**
		 * 比较独立的商业方法(无需Implementor关注和实现)
		 */
		public void printOrder() {
			System.out.print("*名称*：" + getName());
			System.out.println("  *价格*：" + getPrice());
		}
	}

	/**
	 * RefinedAbstraction角色
	 */
	static class MexicanCoffee extends AbstractCoffee {

		public MexicanCoffee(CoffeeAccretion... accretions) {
			super(accretions);
		}

		/**
		 * 修正父类Abstraction的行为
		 */
		@Override
		public String getName() {
			return "墨西哥咖啡" + super.getName();
		}

		/**
		 * 修正父类Abstraction的行为
		 */
		@Override
		public double getPrice() {
			return super.getPrice() + 1.2;
		}
	}

	/**
	 * RefinedAbstraction角色
	 */
	static class VietnameseCoffee extends AbstractCoffee {

		public VietnameseCoffee(CoffeeAccretion... accretions) {
			super(accretions);
		}

		@Override
		public String getName() {
			return "越南咖啡" + super.getName();
		}

		@Override
		public double getPrice() {
			return super.getPrice() + 1.0;
		}
	}

	/**
	 * Implementor角色
	 */
	static interface CoffeeAccretion {

		/**
		 * 名称
		 */
		public String name();

		/**
		 * 价格
		 */
		public double price();
	}

	/**
	 * ConcreteImplementor角色
	 */
	static class Milk implements CoffeeAccretion {

		@Override
		public String name() {
			return "牛奶";
		}

		@Override
		public double price() {
			return 0.2;
		}
	}

	static class Sugar implements CoffeeAccretion {

		@Override
		public String name() {
			return "糖";
		}

		@Override
		public double price() {
			return 0.1;
		}
	}
}
