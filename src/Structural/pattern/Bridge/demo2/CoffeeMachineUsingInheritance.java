/**
 * 
 */
package pattern.Bridge.demo2;

/**
 * 使用继承关系实现的咖啡机
 * <p>
 * 这种实现方式存在的缺点有：<br>
 * 1，子类数量众多(客户端需要知道的信息太多)<p>
 * 通过各种各样的组合可以产生大量的子类，比如
 * 想要增加一个新品种叫美国咖啡，就需要增加多个子类(加糖的美国咖啡、加牛奶的美国咖啡等等)<br>
 * 2，不易扩展<p>
 * 比如想要一个加糖又加奶的越南咖啡，就需要新创建一个子类来实现。
 * 想要增加一个加糖又加巧克力的越南咖啡，就需要新创建多个子类了。<br>
 * 3，不易修改和维护<p>
 * 比如Coffee接口中要增加一个新的方法，就会导致众多子类都必须进行修改。<br>
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-27
 */
public class CoffeeMachineUsingInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 顾客定制各种各样的咖啡
		printOrder(new MexicanCoffee());
		printOrder(new VietnameseCoffee());
		printOrder(new MilkMexicanCoffee());
		printOrder(new MilkVietnameseCoffee());
		printOrder(new SugarMexicanCoffee());
		printOrder(new SugarVietnameseCoffee());
	}

	private static void printOrder(Coffee coffee) {
		System.out.println("名称：" + coffee.getName());
		System.out.println("价格：" + coffee.getPrice());
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
	}

	static class MexicanCoffee implements Coffee {

		@Override
		public String getName() {
			return "墨西哥咖啡";
		}

		@Override
		public double getPrice() {
			return 1.2;
		}
	}

	static class VietnameseCoffee implements Coffee {

		@Override
		public String getName() {
			return "越南咖啡";
		}

		@Override
		public double getPrice() {
			return 1.0;
		}
	}

	static class MilkMexicanCoffee extends MexicanCoffee {

		@Override
		public String getName() {
			return "加牛奶的" + super.getName();
		}

		@Override
		public double getPrice() {
			return super.getPrice() + 0.2;
		}
	}

	static class MilkVietnameseCoffee extends VietnameseCoffee {

		@Override
		public String getName() {
			return "加牛奶的" + super.getName();
		}

		@Override
		public double getPrice() {
			return super.getPrice() + 0.2;
		}
	}

	static class SugarMexicanCoffee extends MexicanCoffee {

		@Override
		public String getName() {
			return "加糖的" + super.getName();
		}

		@Override
		public double getPrice() {
			return super.getPrice() + 0.1;
		}
	}

	static class SugarVietnameseCoffee extends VietnameseCoffee {

		@Override
		public String getName() {
			return "加糖的" + super.getName();
		}

		@Override
		public double getPrice() {
			return super.getPrice() + 0.1;
		}
	}
}