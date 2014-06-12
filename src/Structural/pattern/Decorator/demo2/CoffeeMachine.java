/**
 * 
 */
package pattern.Decorator.demo2;

/**
 * ����������(Coffee�ͻ�����)
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-12
 */
public class CoffeeMachine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Coffee pureCoffee = new VietnameseCoffee();
		Coffee cappuccino = new MilkDecorator(
				new ChocolateDecorator(pureCoffee));
		System.out.println("������ŵ��");
		printOrder(cappuccino);

		Coffee pureCoffee2 = new MexicanCoffee();
		Coffee black = new SugarDecorator(pureCoffee2);
		System.out.println("�ڿ��ȣ�");
		printOrder(black);

		Coffee pureCoffee3 = new VietnameseCoffee();
		Coffee mocha = new MilkDecorator(new ChocolateDecorator(
				new SugarDecorator(pureCoffee3)));
		System.out.println("Ħ����");
		printOrder(mocha);
	}

	private static void printOrder(Coffee coffee) {
		System.out.println("�ɷ֣�" + coffee.getName());
		System.out.println("�۸�" + coffee.getPrice());
	}
}