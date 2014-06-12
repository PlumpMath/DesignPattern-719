/**
 * 
 */
package pattern.Bridge.demo2;

/**
 * 使用装饰模式实现的咖啡机
 * <p>
 * 这种实现方式克服了使用继承关系的一些缺点：<br>
 * 1，减少了子类数量(客户端需要知道的信息减少了)<p>
 * 客户端之需要记住Coffee种类和各种装饰器即可自由组装不同风味的咖啡<br>
 * 2，较易扩展<p>
 * 比如想要一个加糖又加奶的越南咖啡，只需要使用两个装饰器装饰即可。
 * 想要增加一个加糖又加巧克力的越南咖啡，只需要新创建一个巧克力装饰器即可。<br>
 * <p>
 * 它仍然存在的缺点是：<br>
 * 3，不易修改和维护<p>
 * 比如Coffee接口中要增加一个新的方法，就会导致众多子类都必须进行修改。<br>
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-27
 */
public class CoffeeMachineUsingDecorator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 顾客定制各种各样的咖啡，只需要记住几个种类即可以自由组装
		printOrder(new MexicanCoffee());
		printOrder(new VietnameseCoffee());
		printOrder(new MilkDecorator(new MexicanCoffee()));
		printOrder(new MilkDecorator(new VietnameseCoffee()));
		printOrder(new SugarDecorator(new MexicanCoffee()));
		printOrder(new SugarDecorator(new VietnameseCoffee()));
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

	static abstract class CoffeeDecorator implements Coffee {

		// 被装饰的咖啡
		protected Coffee coffee;
		
		public CoffeeDecorator(Coffee coffee) {
			this.coffee = coffee;
		}
	}
	
	static class MilkDecorator extends CoffeeDecorator {

		public MilkDecorator(Coffee coffee) {
			super(coffee);
		}

		@Override
		public String getName() {
			return coffee.getName() + " 加牛奶";
		}

		@Override
		public double getPrice() {
			return coffee.getPrice() + 0.2;
		}
	}
	
	static class SugarDecorator extends CoffeeDecorator {

		public SugarDecorator(Coffee coffee) {
			super(coffee);
		}

		@Override
		public String getName() {
			return coffee.getName() + " 加糖";
		}

		@Override
		public double getPrice() {
			return coffee.getPrice() + 0.1;
		}
	}
}