/**
 * 
 */
package pattern.Decorator.more;

/**
 * ʡ�Գ���װ�ν�ɫ
 * <p>
 * ���ֻ��һ��ConcreteDecorator�࣬��û�б�Ҫ����һ��������
 * ����Decorator���ˣ����԰ѳ���װ�ν�ɫ�;���װ�ν�ɫ�����κϲ���һ����
 * ������ֻ����������װ������ڵ�����£���������������
 * �����������װ�������Ŀ�������Ļ���ʹ��һ�������ĳ���װ�ν�ɫ
 * Decorator�������ֳ���;�������ξ��Ǳ�Ҫ���ˡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-13
 */
public class AbsDecoratorOmitted {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Component component = new ConcreteDecorator(new ConcreteComponent());
		component.operation();
	}
	
	static interface Component {

		/**
		 * ҵ�񷽷�
		 */
		public void operation();
	}

	static class ConcreteComponent implements Component {

		public void operation() {
			System.out.println("operation in ConcreteComponent.");
		}
	}

	static class ConcreteDecorator implements Component {

		private Component component;

		public ConcreteDecorator(Component component) {
			this.component = component;
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