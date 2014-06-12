/**
 * 
 */
package pattern.Mediator.demo3.after;

/**
 * 抽象调停者
 * <p>
 * 抽象调停者角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-8
 */
public interface IMediator {

	/**
	 * 调停者最重要的方法，叫做事件方法，处理多个对象之间的关系
	 * 
	 * @param command
	 *            命令
	 * @param number
	 *            数量
	 */
	public void execute(String command, int number);
}