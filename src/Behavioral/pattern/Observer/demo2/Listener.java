/**
 * 
 */
package pattern.Observer.demo2;

/**
 * 监听器
 * <p>
 * 观察者角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-10
 */
public interface Listener {

	/**
	 * 接收到事件后的动作
	 * 
	 * @param event
	 *            事件
	 */
	public void doAction(Event event);
}