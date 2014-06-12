/**
 * 
 */
package pattern.Command.demo3;

/**
 * 宏命令接口
 * <p>
 * 宏命令可将一组单一命令合并成为一个命令集
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-4
 */
public interface MacroCommand extends Command {

	/**
	 * 增加一个命令
	 */
	public void addCommand(Command command);

	/**
	 * 删除指定命令
	 */
	public void removeCommand(Command command);
}