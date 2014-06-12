/**
 * 
 */
package pattern.Observer.demo2;

import pattern.Observer.demo2.TrafficLight.TrafficLightColor;

/**
 * 红绿灯管理器
 * <p>
 * 客户端类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-10
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