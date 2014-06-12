/**
 * 
 */
package pattern.Bridge.demo2;

/**
 * ʹ�ü̳й�ϵʵ�ֵĿ��Ȼ�
 * <p>
 * ����ʵ�ַ�ʽ���ڵ�ȱ���У�<br>
 * 1�����������ڶ�(�ͻ�����Ҫ֪������Ϣ̫��)<p>
 * ͨ�����ָ�������Ͽ��Բ������������࣬����
 * ��Ҫ����һ����Ʒ�ֽ��������ȣ�����Ҫ���Ӷ������(���ǵ��������ȡ���ţ�̵��������ȵȵ�)<br>
 * 2��������չ<p>
 * ������Ҫһ�������ּ��̵�Խ�Ͽ��ȣ�����Ҫ�´���һ��������ʵ�֡�
 * ��Ҫ����һ�������ּ��ɿ�����Խ�Ͽ��ȣ�����Ҫ�´�����������ˡ�<br>
 * 3�������޸ĺ�ά��<p>
 * ����Coffee�ӿ���Ҫ����һ���µķ������ͻᵼ���ڶ����඼��������޸ġ�<br>
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-27
 */
public class CoffeeMachineUsingInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �˿Ͷ��Ƹ��ָ����Ŀ���
		printOrder(new MexicanCoffee());
		printOrder(new VietnameseCoffee());
		printOrder(new MilkMexicanCoffee());
		printOrder(new MilkVietnameseCoffee());
		printOrder(new SugarMexicanCoffee());
		printOrder(new SugarVietnameseCoffee());
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

	static class MilkMexicanCoffee extends MexicanCoffee {

		@Override
		public String getName() {
			return "��ţ�̵�" + super.getName();
		}

		@Override
		public double getPrice() {
			return super.getPrice() + 0.2;
		}
	}

	static class MilkVietnameseCoffee extends VietnameseCoffee {

		@Override
		public String getName() {
			return "��ţ�̵�" + super.getName();
		}

		@Override
		public double getPrice() {
			return super.getPrice() + 0.2;
		}
	}

	static class SugarMexicanCoffee extends MexicanCoffee {

		@Override
		public String getName() {
			return "���ǵ�" + super.getName();
		}

		@Override
		public double getPrice() {
			return super.getPrice() + 0.1;
		}
	}

	static class SugarVietnameseCoffee extends VietnameseCoffee {

		@Override
		public String getName() {
			return "���ǵ�" + super.getName();
		}

		@Override
		public double getPrice() {
			return super.getPrice() + 0.1;
		}
	}
}