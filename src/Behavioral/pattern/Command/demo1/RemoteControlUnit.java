/**
 * 
 */
package pattern.Command.demo1;

/**
 * 遥控器
 * <p>
 * 请求者(Invoker)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-3
 */
public class RemoteControlUnit {

	private Command command;// 持有的当前命令

	private Command getCommand() {
		return command;
	}

	/**
	 * 设置当前命令
	 */
	public void setCommand(Command command) {
		this.command = command;
	}

	/**
	 * 请求执行命令
	 */
	public void executeCommand() {
		getCommand().execute();
	}
}