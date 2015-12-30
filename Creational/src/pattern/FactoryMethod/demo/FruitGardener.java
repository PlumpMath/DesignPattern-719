/**
 * 
 */
package pattern.FactoryMethod.demo;

/**
 * 抽象园丁接口
 * <p>
 * 它是工厂方法模式的核心，但是它并不掌握水果类的生杀大权
 * 相反的这项权力被交给它的子类，它实际上是所有具体园丁(工厂)角色的超类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-3
 */
public interface FruitGardener {

	/**
	 * 生产水果
	 */
	public Fruit factory();
}
