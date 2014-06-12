/**
 * 
 */
package pattern.Composite.transparent;

import java.util.List;

/**
 * 抽象构件(Component)角色
 * <p>
 * 这是一个抽象角色，它给参加组合的对象定义出公共的接口及其默认行为。
 * 这个接口可以用来管理所有的子对象，要提供一个接口以规范取得和管理下层构件，
 * 包括add()、remove()以及getChild()之类的方法。
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
	
	/**
	 * 增加一个构件
	 */
	public void add(Component component);
	
	/**
	 * 删除指定构件
	 */
	public void remove(Component component);
	
	/**
	 * 返回所有的构件
	 */
	public List<Component> getComponents();
}