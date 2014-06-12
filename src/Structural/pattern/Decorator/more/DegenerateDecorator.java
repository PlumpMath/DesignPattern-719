/**
 * 
 */
package pattern.Decorator.more;

import pattern.Decorator.Component;
import pattern.Decorator.ConcreteComponent;
import pattern.Decorator.Decorator;

/**
 * �˻���װ��ģʽ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-13
 */
public class DegenerateDecorator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �ͻ��˿�������ConcreteDecorator2���͵ı�����
		ConcreteDecorator2 decorator2 = new ConcreteDecorator2(
				new ConcreteComponent());
		// �Ӷ�����ConcreteDecorator2���в��еķ���
		decorator2.newOperation();
		// ֻҪ�ͻ��˲���Ҫ������Щ����װ�εķ�������ֻ����
		// ����Component�ķ�������ôװ��ģʽ����Ȼ��ͬ��͸����
		decorator2.operation();
	}

	/**
	 * װ��ģʽ���������ڲ��ı�ӿڵ�ǰ���£���ǿ�����ǵ�������ܡ�
     * ����ǿ���ܵ�ʱ��������Ҫ�����µĹ����ķ�����
     * ��͵����˴������װ��ģʽ��ʵ����"��͸����"����������ȫ"͸��"�ġ�
     * ����֮������װ��ģʽ�ı�ӿڣ������µķ�����
     * JDK�е�BufferedReader����һ��ʵ�ʵ����ӣ��������readLine()�����������е�
	 */
	static class ConcreteDecorator2 extends Decorator {

		public ConcreteDecorator2(Component component) {
			super(component);
		}

		@Override
		public void operation() {
			getComponent().operation();
			System.out.println("operation in ConcreteDecorator2.");
		}

		/**
		 * ����ConcreteDecorator2���е��·���
		 */
		public void newOperation() {
			System.out.println("newOperation in ConcreteDecorator2.");
		}
	}
}