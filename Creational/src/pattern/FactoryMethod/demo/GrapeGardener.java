/**
 * 
 */
package pattern.FactoryMethod.demo;

/**
 * 葡萄园丁类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-24
 */
public class GrapeGardener implements FruitGardener {

	/**
	 * 生产葡萄
	 */
	public Fruit factory() {
		return new Grape();
	}
}
