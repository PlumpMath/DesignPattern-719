/**
 * 
 */
package pattern.Composite.transparent;

import java.util.List;

/**
 * 树叶构件(Leaf)角色
 * <p>
 * 代表参加组合的树叶对象，定义出参加组合的原始对象的行为。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-11
 */
public class Leaf implements Component {

	@Override
	public void operation() {
		System.out.println("Leaf operation.");
	}

	/** 给出管理子类对象的方法的平庸实现 */
	
	@Override
	public void add(Component component) {
		// do nothing
	}

	@Override
	public List<Component> getComponents() {
		return null;
	}

	@Override
	public void remove(Component component) {
		// do nothing
	}
}