/**
 * 
 */
package pattern.Command.demo3;

import java.util.ArrayList;
import java.util.List;

/**
 * 宏命令的列表实现
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-4
 */
public class MacroCommandListImpl implements MacroCommand {

	private List<Command> commands;// 命令集

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
	 * 按照命令的加入顺序依次执行
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