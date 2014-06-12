/**
 * 
 */
package pattern.Observer.demo2;

/**
 * 交警类
 * <p>
 * 具体观察者角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-11
 */
public class TrafficPolice implements Listener {
	
	@Override
	public void doAction(Event event) {
		// 只关心红绿灯运行故障事件，Event含有足够的信息供使用
		if (event.getEventType() == EventType.LIGHT_FAILURE) {
			System.out.println("TrafficPolice：OK,I know.");
		}
	}
}