/**
 * 
 */
package pattern.Composite.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构件(Composite)角色
 * <p>
 * 代表参加组合的有下级子对象的对象，树枝类给出所有管理子对象的方法。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-11
 */
public class Composite implements Component {

	private List<Component> components;

	@Override
	public void operation() {
		// 遍历所有的构件，都执行operation()方法
		for (Component component : getComponents()) {
			component.operation();
		}
	}

	/** 以下为管理子对象的方法 */
	
	/**
	 * 增加一个构件
	 */
	public void add(Component component) {
		getComponents().add(component);
	}

	/**
	 * 删除指定构件
	 */
	public void remove(Component component) {
		getComponents().remove(component);
	}

	/**
	 * 返回所有的构件
	 */
	public List<Component> getComponents() {
		if (components == null) {
			components = new ArrayList<Component>();
		}
		return components;
	}
}