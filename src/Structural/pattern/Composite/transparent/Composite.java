/**
 * 
 */
package pattern.Composite.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构件(Composite)角色
 * <p>
 * 代表参加组合的有下级子对象的对象，定义出这样的对象的行为。
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

	public void add(Component component) {
		getComponents().add(component);
	}

	public void remove(Component component) {
		getComponents().remove(component);
	}

	public List<Component> getComponents() {
		if (components == null) {
			components = new ArrayList<Component>();
		}
		return components;
	}
}
