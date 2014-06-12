/**
 * 
 */
package pattern.Builder;

import java.util.Date;

/**
 * 具体产品建造者
 * <p>
 * 它是模式中直接创建产品对象的角色，它需要完全实现抽象建造者所声明的接口。
 * 担任这个角色的是与应用程序紧密相关的一些类，它们在应用程序调用下创建产品的实例。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-16
 */
public class ConcreteBuilder implements Builder {

	private ConcreteProduct product = new ConcreteProduct();

	/**
	 * 建造零件1
	 */
	public void buildPart1() {
		product.setPart1((int) (Math.random() * 100));
	}

	/**
	 * 建造零件2
	 */
	public void buildPart2() {
		product.setPart2(new Date().toString());
	}

	/**
	 * 取回组装好的Product对象
	 */
	public Product retrieve() {
		return product;
	}
}