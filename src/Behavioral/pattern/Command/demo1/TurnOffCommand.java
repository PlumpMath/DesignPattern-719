/**
 * 
 */
package pattern.Command.demo1;

/**
 * 关闭命令
 * <p>
 * 具体命令(ConcreteCommand)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-3
 */
public class TurnOffCommand implements Command {

	private Switchable sw;

	public TurnOffCommand(Switchable tv) {
		this.sw = tv;
	}

	/**
	 * 执行命令
	 *
	 * @see pattern.Command.demo1.Command#execute()
	 */
	@Override
	public void execute() {
		sw.turnOff();
	}
}