/**
 * 
 */
package pattern.Command.demo2;

/**
 * Copy复制命令
 * <p>
 * 具体命令(ConcreteCommand)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-4
 */
public class CopyCommand extends AbstractCommand {

	public CopyCommand(TextEditor editor) {
		super(editor);
	}

	@Override
	public void doAction() {
		// ...copy
	}

	@Override
	public void undo() {
		// ...un copy
	}
}