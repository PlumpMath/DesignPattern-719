/**
 * 
 */
package pattern.Composite.safe;

/**
 * 抽象构件(Component)角色
 * <p>
 * 这是一个抽象角色，它给参加组合的对象定义出公共的接口及其默认行为，可以用来管理所有的子对象。
 * 合成对象通常把它所包含的子对象当作类型为Component的对象。
 * 在安全式的合成模式里，抽象构件角色并不定义出管理子对象的方法，这一定义由树枝构件对象给出。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-11
 */
public interface Component {

	/**
	 * 示例方法
	 */
	public void operation();
}