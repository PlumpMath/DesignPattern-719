/**
 * 
 */
package pattern.Observer.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * 源的抽象基类
 * <p>
 * 抽象被观察者角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-10
 */
public abstract class AbstractSource implements Source{
	
	private List<Listener> listeners;// 监听器列表

	protected List<Listener> getListeners() {
		if (listeners == null) {
			listeners = new ArrayList<Listener>();
		}
		return listeners;
	}

	public void addListener(Listener l) {
		getListeners().add(l);
	}

	public void removeListener(Listener l) {
		getListeners().remove(l);
	}

	/**
	 * 发事件通知所有的监听器，让它们执行相关动作
	 *
	 * @see pattern.Observer.demo2.Source#fireEvent(pattern.Observer.demo2.Event)
	 */
	public void fireEvent(Event event) {
		for (Listener listener : getListeners()) {
			listener.doAction(event);
		}
	}
}