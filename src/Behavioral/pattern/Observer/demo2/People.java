/**
 * 
 */
package pattern.Observer.demo2;

import pattern.Observer.demo2.TrafficLight.TrafficLightColor;

/**
 * 行人类
 * <p>
 * 具体观察者角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-10
 */
public class People implements Listener {
	
	@Override
	public void doAction(Event event) {
		// 只关心红绿灯颜色改变事件，Event含有足够的信息供使用
		if (event.getEventType() == EventType.COLOR_CHANGED) {
			TrafficLight tlight = (TrafficLight) event.getSource();
			// 红灯行，绿灯停
			if (tlight.getColor() == TrafficLightColor.RED) {
				System.out.println("People can cross.");
			} else {
				System.out.println("People must wait.");
			}
		}
	}
}