/**
 * 
 */
package pattern.Observer.demo2;

/**
 * �¼�
 * <p>
 * ����ӿ�����ΪԴ�ͼ���������ͨ�ŵ���ʹ����
 * �������˼���������Ȥ��������Ϣ����Դ���������ݸ�������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-11
 */
public interface Event {

	/**
	 * �����¼�����
	 */
	public EventType getEventType();

	/**
	 * ����Դ����
	 */
	public Source getSource();
}