/**
 * 
 */
package pattern.Decorator;

/**
 * 具体装饰角色
 * <p>
 * 负责给构件对象贴上附加的责任。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-13
 */
public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(Component component) {
		super(component);
	}

	/**
	 * 每一个实现的方法都委派给实际构件对象，但并不单纯的委派，而是有功能的增强
	 *
	 * @see pattern.Decorator.Component#operation()
	 */
	@Override
	public void operation() {
		getComponent().operation();
		System.out.println("operation in ConcreteDecorator.");
	}
}