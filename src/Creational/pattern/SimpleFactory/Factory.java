/**
 * 
 */
package pattern.SimpleFactory;

/**
 * 工厂类
 * <p>
 * 担任这个角色的是工厂方法模式的核心，含有与应用紧密相关的商业逻辑。
 * 工厂类在客户端的直接调用下创建产品对象，它往往由一个具体Java类实现。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-3
 */
public class Factory {

	/**
	 * 创建一个新的具体产品的实例并返还给调用者
	 * <p>
	 * 这个工厂方法一般都是静态的，当然也可以不是。
	 */
	public static Product create() {
		return new ConcreteProduct();
	}
}