/**
 * 
 */
package pattern.SimpleFactory.demo;

/**
 * 消费水果的客户端类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-3
 */
public class FruitClient {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			Fruit grape = FruitGardener.factory("grape");
			Fruit apple = FruitGardener.factory("apple");
			Fruit strawberry = FruitGardener.factory("strawberry");
			Fruit banana = FruitGardener.factory("banana");
		} catch (BadFruitException e) {
			e.printStackTrace();
		}
	}
}
