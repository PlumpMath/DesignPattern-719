/**
 * 
 */
package pattern.Decorator;

/**
 * 客户端类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-13
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 装饰模式对客户端的透明性要求程序不要声明一个ConcreteDecorator
		 * 类型的变量，而是应当声明一个Component类型的变量，
		 * 这就是装饰模式对客户端是完全透明的含义。如下所示：
		 */
		Component component = new ConcreteComponent();
		component.operation();
		Component decorator = new ConcreteDecorator(component);
		decorator.operation();
		Component decorator2 = new ConcreteDecorator(decorator);
		decorator2.operation();
		// 典型的创建过程如下所示：
		new ConcreteDecorator(new ConcreteDecorator(new ConcreteComponent()));
		// 每一层包裹都提供了一些新的功能
	}
}