/**
 * 
 */
package pattern.Command.demo1;

/**
 * 电视
 * <p>
 * (具体)接收者(Receiver)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-3
 */
public class Television implements Switchable {

	@Override
	public void turnOn() {
		System.out.println("trun on the TV.");
	}

	@Override
	public void turnOff() {
		System.out.println("trun off the TV.");
	}
}