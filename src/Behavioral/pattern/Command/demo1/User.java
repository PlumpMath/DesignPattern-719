/**
 * 
 */
package pattern.Command.demo1;

/**
 * 用户类
 * <p>
 * 客户(Client)角色，模拟用户用遥控器开关电视和电灯
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-3
 */
public class User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 获得一个遥控器
		RemoteControlUnit rcunit = new RemoteControlUnit();
		Television tv = new Television();
		Light light = new Light();
		// 打开电视
		Command turnOn = new TurnOnCommand(tv);
		rcunit.setCommand(turnOn);
		rcunit.executeCommand();
		// 关闭电视
		Command turnoff = new TurnOffCommand(tv);
		rcunit.setCommand(turnoff);
		rcunit.executeCommand();
		// 打开电灯
		turnOn = new TurnOnCommand(light);
		rcunit.setCommand(turnOn);
		rcunit.executeCommand();
		// 关闭电灯
		turnoff = new TurnOffCommand(light);
		rcunit.setCommand(turnoff);
		rcunit.executeCommand();
	}
}