/**
 * 
 */
package pattern.Observer.demo2;

/**
 * 事件源
 * <p>
 * 被观察者角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-10
 */
public interface Source {

	/**
	 * 添加监听器
	 */
	public void addListener(Listener l);

	/**
	 * 删除监听器
	 */
	public void removeListener(Listener l);

	/**
	 * 发事件通知监听器
	 * 
	 * @param event
	 *            事件
	 */
	public void fireEvent(Event event);
}