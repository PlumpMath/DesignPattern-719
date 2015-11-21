/**
 * 
 */
package pattern.Command.demo2;

import java.util.Stack;

/**
 * 编辑动作
 * <p>
 * 请求者(Invoker)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-4
 */
public class EditAction {

	private Command command;// 当期编辑命令

	private Stack<Command> undoCommands;// 待撤销的命令栈

	public EditAction() {
		this.command = new NullCommand();
		this.undoCommands = new Stack<Command>();
	}

	/**
	 * 设置当前编辑命令
	 */
	public void setCommand(Command command) {
		this.command = command;
	}

	/**
	 * 执行当前编辑命令
	 */
	public void executeCommand() {
		command.doAction();
		// 将命令加入栈
		undoCommands.push(command);
	}

	/**
	 * 撤销上一个命令的操作
	 */
	public void rollbackCommand() {
		if (!undoCommands.empty()) {
			// 将待撤销命令弹出栈并执行undo操作
			undoCommands.pop().undo();
		}
	}
}
