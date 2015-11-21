/**
 * 
 */
package pattern.Command.demo1;

/**
 * 电灯
 * <p>
 * (具体)接收者(Receiver)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-4
 */
public class Light implements Switchable {

	@Override
	public void turnOn() {
		System.out.println("turn on the light.");
	}

	@Override
	public void turnOff() {
		System.out.println("turn off the light.");
	}
}
