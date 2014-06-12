/**
 * 
 */
package pattern.Decorator.more;

/**
 * ʡ�Գ��󹹼���ɫ
 * <p>
 * ���ֻ��һ��ConcreteComponent���û�г����Component��(�ӿ�)
 * ��ôDecorator�ྭ��������ConcreteComponent��һ������
 * ��ʱConcreteComponent�Ͱ�����˫�ؽ�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-13
 */
public class AbsComponentOmitted {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcreteComponent component = new ConcreteDecorator(
				new ConcreteComponent());
		component.operation();
	}
	
	static class ConcreteComponent {

		/**
		 * ҵ�񷽷�
		 */
		public void operation() {
			System.out.println("operation in ConcreteComponent.");
		}
	}

	static abstract class Decorator extends ConcreteComponent {

		protected ConcreteComponent component;

		public Decorator(ConcreteComponent component) {
			this.component = component;
		}
	}

	static class ConcreteDecorator extends Decorator {

		public ConcreteDecorator(ConcreteComponent component) {
			super(component);
		}

		/**
		 * װ�����д˷���������˶���Ĺ���
		 *
		 * @see pattern.Decorator.more.ConcreteComponent#operation()
		 */
		public void operation() {
			component.operation();
			System.out.println("operation in ConcreteDecorator.");
		}
	}
}