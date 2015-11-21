/**
 * 
 */
package pattern.FactoryMethod;

/**
 * 具体工厂类2
 * <p>
 * 专门用于创建ConcreteProduct2实例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-24
 */
public class ConcreteFactory2 implements Factory {

	/**
	 * 创建Product的实例
	 */
	public Product create() {
		return new ConcreteProduct2();
	}
}
