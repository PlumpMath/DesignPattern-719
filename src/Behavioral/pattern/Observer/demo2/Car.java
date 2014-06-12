/**
 * 
 */
package pattern.Observer.demo2;

import pattern.Observer.demo2.TrafficLight.TrafficLightColor;

/**
 * �γ���
 * <p>
 * ����۲��߽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-10
 */
public class Car implements Listener {
	
	@Override
	public void doAction(Event event) {
		// ֻ���ĺ��̵���ɫ�ı��¼���Event�����㹻����Ϣ��ʹ��
		if (event.getEventType() == EventType.COLOR_CHANGED) {
			TrafficLight tlight = (TrafficLight) event.getSource();
			// ���ͣ���̵���
			if (tlight.getColor() == TrafficLightColor.RED) {
				System.out.println("Car must stop.");
			} else {
				System.out.println("Car can move.");
			}
		}
	}
}