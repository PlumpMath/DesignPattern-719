/**
 * 
 */
package pattern.Command.demo2;

/**
 * 命令接口
 * <p>
 * 命令(Command)角色，要求实现do和undo功能。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-4
 */
public interface Command {

	/**
	 * 执行命令
	 */
	public void doAction();
	
	/**
	 * 撤销执行
	 */
	public void undo();
}
