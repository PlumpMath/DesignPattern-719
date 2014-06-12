/**
 * 
 */
package pattern.Observer.demo2;

import pattern.Observer.demo2.TrafficLight.TrafficLightColor;

/**
 * ������
 * <p>
 * ����۲��߽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-10
 */
public class People implements Listener {
	
	@Override
	public void doAction(Event event) {
		// ֻ���ĺ��̵���ɫ�ı��¼���Event�����㹻����Ϣ��ʹ��
		if (event.getEventType() == EventType.COLOR_CHANGED) {
			TrafficLight tlight = (TrafficLight) event.getSource();
			// ����У��̵�ͣ
			if (tlight.getColor() == TrafficLightColor.RED) {
				System.out.println("People can cross.");
			} else {
				System.out.println("People must wait.");
			}
		}
	}
}