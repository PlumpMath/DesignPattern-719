/**
 * 
 */
package pattern.Command.demo3;

import java.util.ArrayList;
import java.util.List;

/**
 * ��������б�ʵ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public class MacroCommandListImpl implements MacroCommand {

	private List<Command> commands;// ���

	public MacroCommandListImpl() {
		this.commands = new ArrayList<Command>();
	}

	@Override
	public void addCommand(Command command) {
		commands.add(command);
	}

	@Override
	public void removeCommand(Command command) {
		commands.remove(command);
	}

	/**
	 * ��������ļ���˳������ִ��
	 *
	 * @see pattern.Command.demo3.Command#execute()
	 */
	@Override
	public void execute() {
		for (Command command : commands) {
			command.execute();
		}
	}
}