/**
 * 
 */
package pattern.Observer.demo2;

/**
 * 事件
 * <p>
 * 这个接口是作为源和监听器进行通信的信使对象
 * 它包含了监听器感兴趣的所有信息，由源创建并传递给监听器
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-11
 */
public interface Event {

	/**
	 * 返回事件类型
	 */
	public EventType getEventType();

	/**
	 * 返回源对象
	 */
	public Source getSource();
}