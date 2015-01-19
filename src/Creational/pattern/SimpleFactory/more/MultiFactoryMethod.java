/**
 * 
 */
package pattern.SimpleFactory.more;

/**
 * 2.多个工厂方法
 * <p>
 * 工厂类可以有多于一个的工厂方法，分别负责创建不同的产品对象。
 * JDK中的java.text.DateFormat类就是这样的例子。
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

	static void consume() {
		ClothesFactory.create("Shirt");
		ClothesFactory.create("Shirt", "white");
		ClothesFactory.create("Jacket");
		ClothesFactory.create("Jacket", "red");
	}
}

class ClothesFactory {

	/**
	 * 创建指定品种的衣服
	 */
	static Clothes create(String which) {
		if (which.equalsIgnoreCase("Shirt")) {
			return new Shirt();
		} else if (which.equalsIgnoreCase("Jacket")) {
			return new Jacket();
		}
		return null;
	}

	/**
	 * 创建指定品种和颜色的衣服
	 */
	static Clothes create(String which, String color) {
		if (which.equalsIgnoreCase("Shirt")) {
			return new Shirt(color);
		} else if (which.equalsIgnoreCase("Jacket")) {
			return new Jacket(color);
		}
		return null;
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