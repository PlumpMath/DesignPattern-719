/**
 * 
 */
package pattern.AbstractFactory;

/**
 * 具体工厂类1
 * <p>
 * 专门用于创建产品族1中的各个对象实例
 * <p>
 * 实现了抽象工厂接口的具体类，直接在客户端的调用下创建产品的实例
 * 含有选择合适的产品对象的逻辑，该逻辑是与应用系统的商业逻辑紧密相关的
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-24
 */
public class ConcreteFactory1 implements Factory {

	public ProductA createA() {
		return new ConcreteProductA1();
	}

	public ProductB createB() {
		return new ConcreteProductB1();
	}
}