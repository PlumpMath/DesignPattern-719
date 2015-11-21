/**
 * 
 */
package pattern.FactoryMethod.demo;

/**
 * 苹果园丁类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-24
 */
public class AppleGardener implements FruitGardener {

	/**
	 * 生产苹果
	 */
	public Fruit factory() {
		return new Apple();
	}
}
