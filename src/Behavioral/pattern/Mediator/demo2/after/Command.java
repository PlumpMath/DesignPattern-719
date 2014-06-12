/**
 * 
 */
package pattern.Mediator.demo2.after;

/**
 * 命令接口
 * <p>
 * 对按键动作的抽象，非命令模式
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-9
 */
public interface Command {

	/**
	 * 执行按键动作
	 */
	public void execute();
}