/**
 * 
 */
package pattern.Observer.demo2;

/**
 * ������
 * <p>
 * ����۲��߽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-11
 */
public class TrafficPolice implements Listener {
	
	@Override
	public void doAction(Event event) {
		// ֻ���ĺ��̵����й����¼���Event�����㹻����Ϣ��ʹ��
		if (event.getEventType() == EventType.LIGHT_FAILURE) {
			System.out.println("TrafficPolice��OK,I know.");
		}
	}
}