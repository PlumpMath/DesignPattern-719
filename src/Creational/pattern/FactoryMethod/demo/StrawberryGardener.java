/**
 * 
 */
package pattern.FactoryMethod.demo;

/**
 * 草莓园丁类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-24
 */
public class StrawberryGardener implements FruitGardener {

	/**
	 * 生产草莓
	 */
	public Fruit factory() {
		return new Strawberry();
	}
}