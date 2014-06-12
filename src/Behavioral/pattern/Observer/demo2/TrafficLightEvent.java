/**
 * 
 */
package pattern.Observer.demo2;

/**
 * 红绿灯事件
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-11
 */
public class TrafficLightEvent implements Event {

	private EventType eventType;// 事件类型
	private Source source;// 源

	/**
	 * @param eventType
	 *            事件类型
	 * @param source
	 *            源
	 */
	public TrafficLightEvent(EventType eventType, Source source) {
		this.eventType = eventType;
		this.source = source;
	}

	/**
	 * 返回事件类型
	 */
	public EventType getEventType() {
		return eventType;
	}

	/**
	 * 返回源对象
	 */
	public Source getSource() {
		return source;
	}
}