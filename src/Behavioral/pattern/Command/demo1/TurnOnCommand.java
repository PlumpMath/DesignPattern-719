/**
 * 
 */
package pattern.Command.demo1;

/**
 * 打开命令
 * <p>
 * 具体命令(ConcreteCommand)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-3
 */
public class TurnOnCommand implements Command {

	private Switchable sw;

	public TurnOnCommand(Switchable tv) {
		this.sw = tv;
	}

	/**
	 * 执行命令
	 * 
	 * @see pattern.Command.demo1.Command#execute()
	 */
	@Override
	public void execute() {
		sw.turnOn();
	}
}