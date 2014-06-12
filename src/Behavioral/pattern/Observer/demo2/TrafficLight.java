/**
 * 
 */
package pattern.Observer.demo2;

/**
 * 红绿灯
 * <p>
 * 具体被观察者角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-10
 */
public class TrafficLight extends AbstractSource {

	/**
	 * 红绿灯颜色枚举
	 */
	public enum TrafficLightColor {
		/** 红 */
		RED, 
		/** 绿 */
		GREEN
	}
	
	private TrafficLightColor color = TrafficLightColor.RED;// 当前颜色
	private boolean isRunning = true;// 是否正常运行

	/**
	 * 返回当前颜色
	 */
	public TrafficLightColor getColor() {
		return color;
	}

	/**
	 * 改变当前颜色
	 */
	public void setColor(TrafficLightColor color) {
		if (isRunning) {
			if (!color.equals(getColor())) {
				this.color = color;
				System.out.println("\nNow light is " + color.name().toLowerCase());
				// 发一个红绿灯颜色改变事件
				fireEvent(new TrafficLightEvent(EventType.COLOR_CHANGED, this));
			}
		}
	}

	/**
	 * 是否正常运行
	 */
	public boolean isRunning() {
		return isRunning;
	}

	/**
	 * 设置运行状态
	 */
	public void setRunning(boolean isRunning) {
		if (this.isRunning != isRunning) {
			this.isRunning = isRunning;
			System.out.println("\nNow light is "
					+ (isRunning ? "running" : "failure"));
			// 发一个红绿灯运行故障事件
			fireEvent(new TrafficLightEvent(EventType.LIGHT_FAILURE, this));
		}
	}
}