/**
 * 
 */
package pattern.Command.demo1;

/**
 * 可开关的接口
 * <p>
 * (抽象)接收者(Receiver)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-4
 */
public interface Switchable {

	/**
	 * 打开
	 */
	public void turnOn();
	
	/**
	 * 关闭
	 */
	public void turnOff();
}