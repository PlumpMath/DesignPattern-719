/**
 * 
 */
package pattern.AbstractFactory;

/**
 * 具体工厂类2
 * <p>
 * 专门用于创建产品族2中的各个对象实例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-24
 */
public class ConcreteFactory2 implements Factory {

	public ProductA createA() {
		return new ConcreteProductA2();
	}

	public ProductB createB() {
		return new ConcreteProductB2();
	}
}