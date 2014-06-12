/**
 * 
 */
package pattern.Decorator;

/**
 * ����װ�ν�ɫ
 * <p>
 * ����������������ϸ��ӵ����Ρ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-13
 */
public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(Component component) {
		super(component);
	}

	/**
	 * ÿһ��ʵ�ֵķ�����ί�ɸ�ʵ�ʹ������󣬵�����������ί�ɣ������й��ܵ���ǿ
	 *
	 * @see pattern.Decorator.Component#operation()
	 */
	@Override
	public void operation() {
		getComponent().operation();
		System.out.println("operation in ConcreteDecorator.");
	}
}