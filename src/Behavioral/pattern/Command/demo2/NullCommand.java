/**
 * 
 */
package pattern.Command.demo2;

/**
 * 空命令
 * <p>
 * 具体命令(ConcreteCommand)角色，NullObject模式的应用。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-4
 */
public class NullCommand implements Command {

	@Override
	public void doAction() {
		// do nothing
	}

	@Override
	public void undo() {
		// do nothing
	}
}