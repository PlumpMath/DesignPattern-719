/**
 * 
 */
package pattern.Decorator.more;

/**
 * 省略抽象装饰角色
 * <p>
 * 如果只有一个ConcreteDecorator类，就没有必要建立一个单独的
 * 抽象Decorator类了，可以把抽象装饰角色和具体装饰角色的责任合并成一个类
 * 甚至在只有两个具体装饰类存在的情况下，都可以这样做。
 * 但是如果具体装饰类的数目大于三的话，使用一个单独的抽象装饰角色
 * Decorator类来区分抽象和具体的责任就是必要的了。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-13
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
		 * 业务方法
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