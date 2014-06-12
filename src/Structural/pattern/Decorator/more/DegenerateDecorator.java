/**
 * 
 */
package pattern.Decorator.more;

import pattern.Decorator.Component;
import pattern.Decorator.ConcreteComponent;
import pattern.Decorator.Decorator;

/**
 * 退化的装饰模式
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-13
 */
public class DegenerateDecorator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 客户端可以声明ConcreteDecorator2类型的变量，
		ConcreteDecorator2 decorator2 = new ConcreteDecorator2(
				new ConcreteComponent());
		// 从而调用ConcreteDecorator2类中才有的方法
		decorator2.newOperation();
		// 只要客户端不需要调用这些属于装饰的方法，而只调用
		// 属于Component的方法，那么装饰模式就仍然等同于透明的
		decorator2.operation();
	}

	/**
	 * 装饰模式的用意是在不改变接口的前提下，增强所考虑的类的性能。
     * 在增强性能的时候，往往需要建立新的公开的方法。
     * 这就导致了大多数的装饰模式的实现是"半透明的"，而不是完全"透明"的。
     * 换言之，允许装饰模式改变接口，增加新的方法。
     * JDK中的BufferedReader就是一个实际的例子，它里面的readLine()方法就是特有的
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
		 * 这是ConcreteDecorator2特有的新方法
		 */
		public void newOperation() {
			System.out.println("newOperation in ConcreteDecorator2.");
		}
	}
}