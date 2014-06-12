/**
 * 
 */
package pattern.Bridge.demo2;

/**
 * ʹ��װ��ģʽʵ�ֵĿ��Ȼ�
 * <p>
 * ����ʵ�ַ�ʽ�˷���ʹ�ü̳й�ϵ��һЩȱ�㣺<br>
 * 1����������������(�ͻ�����Ҫ֪������Ϣ������)<p>
 * �ͻ���֮��Ҫ��סCoffee����͸���װ��������������װ��ͬ��ζ�Ŀ���<br>
 * 2��������չ<p>
 * ������Ҫһ�������ּ��̵�Խ�Ͽ��ȣ�ֻ��Ҫʹ������װ����װ�μ��ɡ�
 * ��Ҫ����һ�������ּ��ɿ�����Խ�Ͽ��ȣ�ֻ��Ҫ�´���һ���ɿ���װ�������ɡ�<br>
 * <p>
 * ����Ȼ���ڵ�ȱ���ǣ�<br>
 * 3�������޸ĺ�ά��<p>
 * ����Coffee�ӿ���Ҫ����һ���µķ������ͻᵼ���ڶ����඼��������޸ġ�<br>
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-27
 */
public class CoffeeMachineUsingDecorator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �˿Ͷ��Ƹ��ָ����Ŀ��ȣ�ֻ��Ҫ��ס�������༴����������װ
		printOrder(new MexicanCoffee());
		printOrder(new VietnameseCoffee());
		printOrder(new MilkDecorator(new MexicanCoffee()));
		printOrder(new MilkDecorator(new VietnameseCoffee()));
		printOrder(new SugarDecorator(new MexicanCoffee()));
		printOrder(new SugarDecorator(new VietnameseCoffee()));
	}

	private static void printOrder(Coffee coffee) {
		System.out.println("���ƣ�" + coffee.getName());
		System.out.println("�۸�" + coffee.getPrice());
	}
	
	static interface Coffee {

		/**
		 * ����
		 */
		public String getName();

		/**
		 * �۸�
		 */
		public double getPrice();
	}

	static class MexicanCoffee implements Coffee {

		@Override
		public String getName() {
			return "ī���翧��";
		}

		@Override
		public double getPrice() {
			return 1.2;
		}
	}

	static class VietnameseCoffee implements Coffee {

		@Override
		public String getName() {
			return "Խ�Ͽ���";
		}

		@Override
		public double getPrice() {
			return 1.0;
		}
	}

	static abstract class CoffeeDecorator implements Coffee {

		// ��װ�εĿ���
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
			return coffee.getName() + " ��ţ��";
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
			return coffee.getName() + " ����";
		}

		@Override
		public double getPrice() {
			return coffee.getPrice() + 0.1;
		}
	}
}