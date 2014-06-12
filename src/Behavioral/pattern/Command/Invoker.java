/**
 * 
 */
package pattern.Command;

/**
 * 请求者(Invoker)角色
 * <p>
 * 负责调用命令对象执行请求。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-4
 */
public class Invoker {

	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	/**
	 * 执行命令
	 */
	public void executeCommand() {
		getCommand().execute();
	}
}