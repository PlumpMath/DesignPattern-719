/**
 * 
 */
package pattern.FactoryMethod;

/**
 * 具体工厂类1
 * <p>
 * 专门用于创建ConcreteProduct1实例
 * <p>
 * 实现了抽象工厂接口的具体类，含有与应用密切相关的逻辑
 * 并且受到应用程序的调用以创建产品对象
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-24
 */
public class ConcreteFactory1 implements Factory {

	/**
	 * 创建Product的实例
	 */
	public Product create() {
		return new ConcreteProduct1();
	}
}