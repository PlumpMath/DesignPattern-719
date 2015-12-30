/**
 * 
 */
package pattern.FactoryMethod.demo;

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
		Fruit grape = new GrapeGardener().factory();
		Fruit apple = new AppleGardener().factory();
		Fruit strawberry = new StrawberryGardener().factory();
	}
}
