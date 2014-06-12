/**
 * 
 */
package pattern.Observer.demo2;

/**
 * ���̵��¼�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-11
 */
public class TrafficLightEvent implements Event {

	private EventType eventType;// �¼�����
	private Source source;// Դ

	/**
	 * @param eventType
	 *            �¼�����
	 * @param source
	 *            Դ
	 */
	public TrafficLightEvent(EventType eventType, Source source) {
		this.eventType = eventType;
		this.source = source;
	}

	/**
	 * �����¼�����
	 */
	public EventType getEventType() {
		return eventType;
	}

	/**
	 * ����Դ����
	 */
	public Source getSource() {
		return source;
	}
}