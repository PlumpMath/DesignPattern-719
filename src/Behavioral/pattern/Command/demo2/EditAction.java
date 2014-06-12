/**
 * 
 */
package pattern.Command.demo2;

import java.util.Stack;

/**
 * �༭����
 * <p>
 * ������(Invoker)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public class EditAction {

	private Command command;// ���ڱ༭����

	private Stack<Command> undoCommands;// ������������ջ

	public EditAction() {
		this.command = new NullCommand();
		this.undoCommands = new Stack<Command>();
	}

	/**
	 * ���õ�ǰ�༭����
	 */
	public void setCommand(Command command) {
		this.command = command;
	}

	/**
	 * ִ�е�ǰ�༭����
	 */
	public void executeCommand() {
		command.doAction();
		// ���������ջ
		undoCommands.push(command);
	}

	/**
	 * ������һ������Ĳ���
	 */
	public void rollbackCommand() {
		if (!undoCommands.empty()) {
			// �������������ջ��ִ��undo����
			undoCommands.pop().undo();
		}
	}
}