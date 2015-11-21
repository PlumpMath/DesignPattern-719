/**
 * 
 */
package pattern.Decorator.demo2;

/**
 * 咖啡售卖机(Coffee客户端类)
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-12
 */
public class CoffeeMachine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Coffee pureCoffee = new VietnameseCoffee();
		Coffee cappuccino = new MilkDecorator(
				new ChocolateDecorator(pureCoffee));
		System.out.println("卡布奇诺：");
		printOrder(cappuccino);

		Coffee pureCoffee2 = new MexicanCoffee();
		Coffee black = new SugarDecorator(pureCoffee2);
		System.out.println("黑咖啡：");
		printOrder(black);

		Coffee pureCoffee3 = new VietnameseCoffee();
		Coffee mocha = new MilkDecorator(new ChocolateDecorator(
				new SugarDecorator(pureCoffee3)));
		System.out.println("摩卡：");
		printOrder(mocha);
	}

	private static void printOrder(Coffee coffee) {
		System.out.println("成分：" + coffee.getName());
		System.out.println("价格：" + coffee.getPrice());
	}
}
