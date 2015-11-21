/**
 * 
 */
package pattern.Flyweight;

/**
 * 抽象享元(Flyweight)角色
 * <p>
 * 此角色是所有的具体享元类的超类，为这些类规定出需要实现的公共接口。
 * 那些需要外蕴状态(External State)的操作可以通过调用商业方法以参数形式传入。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-8-2
 */
public abstract class Flyweight {

	/**
	 * 一个示意性的方法，参数state是外蕴状态
	 * 
	 * @param state
	 */
	public abstract void operation(String state);
}
