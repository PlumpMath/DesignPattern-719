/**
 * 
 */
package pattern.FactoryMethod.more;

/**
 * 使用多个工厂方法
 * <p>
 * 抽象工厂角色可以有多于一个的工厂方法，从而使具体工厂角色实现这些不同的工厂方法
 * 这些方法可以提供不同的商业逻辑，以满足提供不同的产品对象的任务
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-4
 */
public class MultiFactoryMethod {

}

/**
 * 使用Clothes的客户端类
 */
class ClothesClient {

	private static ClothesFactory factory1;
	private static ClothesFactory factory2;
	
	static void consume() {
		factory1 = new ShirtFactory();
		factory1.create();
		factory1.create("white");
		factory2 = new JacketFactory();
		factory2.create();
		factory2.create("red");
	}
}

/**
 * Clothes工厂接口
 */
interface ClothesFactory {
	
	/**
	 * 生产衣服
	 */
	public Clothes create();
	
	/**
	 * 生产指定颜色的衣服
	 */
	public Clothes create(String color);
}

/**
 * Shirt工厂
 */
class ShirtFactory implements ClothesFactory {

	public Clothes create() {
		return new Shirt();
	}

	public Clothes create(String color) {
		return new Shirt(color);
	}
}

/**
 * Jacket工厂
 */
class JacketFactory implements ClothesFactory {

	public Clothes create() {
		return new Jacket();
	}

	public Clothes create(String color) {
		return new Jacket(color);
	}
}

/**
 * 衣服基类
 */
abstract class Clothes {

	private String color;// 颜色

	public Clothes() {
		this.color = "black";// 默认黑色
	}

	public Clothes(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

/**
 * 衬衫类
 */
class Shirt extends Clothes {

	public Shirt() {
		super();
	}

	public Shirt(String color) {
		super(color);
	}
}

/**
 * 夹克类
 */
class Jacket extends Clothes {

	public Jacket() {
		super();
	}

	public Jacket(String color) {
		super(color);
	}
}