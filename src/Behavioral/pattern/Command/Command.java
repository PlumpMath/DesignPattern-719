/**
 * 
 */
package pattern.Command;

/**
 * 命令(Command)角色
 * <p>
 * 规定出所有具体命令类必须实现的接口，即一个执行方法。
 * 这是一个抽象角色，通常由一个Java接口或者Java抽象类实现。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-3
 */
public interface Command {

	/**
	 * 执行命令
	 */
	public void execute();
}