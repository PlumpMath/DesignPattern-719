/**
 * 
 */
package pattern.Decorator.more;

/**
 * 省略抽象构件角色
 * <p>
 * 如果只有一个ConcreteComponent类而没有抽象的Component类(接口)
 * 那么Decorator类经常可以是ConcreteComponent的一个子类
 * 此时ConcreteComponent就扮演了双重角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-13
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
		 * 业务方法
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
		 * 装饰类中此方法被添加了额外的功能
		 *
		 * @see pattern.Decorator.more.ConcreteComponent#operation()
		 */
		public void operation() {
			component.operation();
			System.out.println("operation in ConcreteDecorator.");
		}
	}
}
