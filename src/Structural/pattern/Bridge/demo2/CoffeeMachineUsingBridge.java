/**
 * 
 */
package pattern.Bridge.demo2;

import java.util.Arrays;
import java.util.List;

/**
 * ʹ������ģʽʵ�ֵĿ��Ȼ�
 * <p>
 * ����ʵ�ַ�ʽ��������װ��ģʽ���ŵ㣺��������������������������չ��
 * �����Ժ�������һ������Ʒ�֣�ֻ��Ҫ����һ���µ����������ɫ���ɣ�������һ����������ֻ��Ҫ����һ���µľ���ʵ�ֻ���ɫ���ɡ�
 * ���˷������ĵ�ȱ�㣺3�������޸ĺ�ά��������Coffee�ӿ���Ҫ����һ���µķ��������ᵼ���ڶ����඼��������޸ġ�
 * ֻ��Ҫ�޸�Coffee�̳���ϵ�е�������༴�ɣ���CoffeeAccretion�̳���ϵ�������κα䶯��
 * ͬ���ģ����CoffeeAccretion�̳���ϵ��Ҫ�޸�(����ĳ������)��Coffee�̳���ϵҲ����䶯��
 * �������̳���ϵ�ı䶯�����໥�����ģ�����Ӱ�쵽��һ�ˡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-27
 */
public class CoffeeMachineUsingBridge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �˿Ͷ��Ƹ��ָ����Ŀ��ȣ�ֻ��Ҫ�ֹ���Ӹ�������Ｔ��
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
		 * ����
		 */
		public String getName();

		/**
		 * �۸�
		 */
		public double getPrice();

		/**
		 * ��ӡ��������Ϣ
		 */
		public void printOrder();
	}

	/**
	 * Abstraction��ɫ
	 */
	static abstract class AbstractCoffee implements Coffee {

		// ����������б�
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
			// ί�ɵ�����CoffeeAccretion������
			for (CoffeeAccretion accretion : getAccretions()) {
				sb.append("��");
				sb.append(accretion.name());
			}
			return sb.toString();
		}

		@Override
		public double getPrice() {
			if (getAccretions() == null) return 0;
			double price = 0;
			// ί�ɵ�����CoffeeAccretion������
			for (CoffeeAccretion accretion : getAccretions()) {
				price += accretion.price();
			}
			return price;
		}

		/**
		 * �Ƚ϶�������ҵ����(����Implementor��ע��ʵ��)
		 */
		public void printOrder() {
			System.out.print("*����*��" + getName());
			System.out.println("  *�۸�*��" + getPrice());
		}
	}

	/**
	 * RefinedAbstraction��ɫ
	 */
	static class MexicanCoffee extends AbstractCoffee {

		public MexicanCoffee(CoffeeAccretion... accretions) {
			super(accretions);
		}

		/**
		 * ��������Abstraction����Ϊ
		 */
		@Override
		public String getName() {
			return "ī���翧��" + super.getName();
		}

		/**
		 * ��������Abstraction����Ϊ
		 */
		@Override
		public double getPrice() {
			return super.getPrice() + 1.2;
		}
	}

	/**
	 * RefinedAbstraction��ɫ
	 */
	static class VietnameseCoffee extends AbstractCoffee {

		public VietnameseCoffee(CoffeeAccretion... accretions) {
			super(accretions);
		}

		@Override
		public String getName() {
			return "Խ�Ͽ���" + super.getName();
		}

		@Override
		public double getPrice() {
			return super.getPrice() + 1.0;
		}
	}

	/**
	 * Implementor��ɫ
	 */
	static interface CoffeeAccretion {

		/**
		 * ����
		 */
		public String name();

		/**
		 * �۸�
		 */
		public double price();
	}

	/**
	 * ConcreteImplementor��ɫ
	 */
	static class Milk implements CoffeeAccretion {

		@Override
		public String name() {
			return "ţ��";
		}

		@Override
		public double price() {
			return 0.2;
		}
	}

	static class Sugar implements CoffeeAccretion {

		@Override
		public String name() {
			return "��";
		}

		@Override
		public double price() {
			return 0.1;
		}
	}
}