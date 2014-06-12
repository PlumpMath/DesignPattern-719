/**
 * 
 */
package pattern.Observer.demo2;

import pattern.Observer.demo2.TrafficLight.TrafficLightColor;

/**
 * ���̵ƹ�����
 * <p>
 * �ͻ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-10
 */
public class TrafficLightManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TrafficLight tlight = new TrafficLight();
		tlight.addListener(new People());
		tlight.addListener(new Car());
		tlight.addListener(new TrafficPolice());
		tlight.setColor(TrafficLightColor.GREEN);
		tlight.setColor(TrafficLightColor.RED);
		tlight.setColor(TrafficLightColor.GREEN);
		tlight.setColor(TrafficLightColor.RED);
		tlight.setRunning(false);
	}
}