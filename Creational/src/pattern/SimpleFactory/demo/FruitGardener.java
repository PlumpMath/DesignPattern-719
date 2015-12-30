/**
 * 
 */
package pattern.SimpleFactory.demo;

/**
 * 园丁类
 * <p>
 * 实际上是水果的创建工厂类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-3
 */
public class FruitGardener {

	/**
	 * 根据客户端要求生产指定水果
	 * 
	 * @param which
	 *            水果名
	 * @throws BadFruitException
	 */
	public static Fruit factory(String which) throws BadFruitException {
		if ("grape".equals(which)) {
			return new Grape();
		} else if ("apple".equals(which)) {
			return new Apple();
		} else if ("strawberry".equals(which)) {
			return new Strawberry();
		} else {
			throw new BadFruitException("Bad Fruit Request.");
		}
	}
}
