/**
 * 
 */
package pattern.Flyweight.composite;

/**
 * 抽象享元(Flyweight)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-8-2
 */
public abstract class Flyweight {

	/**
	 * 一个示意性的方法，参数state是外蕴状态
	 */
	public abstract void operation(String state);
}