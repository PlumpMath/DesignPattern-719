/**
 * 
 */
package pattern.Mediator.demo2.after;

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
	 * 四个事件方法，处理多个对象之间的关系
	 */

	/**
	 * 通知采购组采购电脑
	 */
	public void buyComputer(int number);

	/**
	 * 通知销售组销售电脑
	 */
	public void sellComputer(int number);

	/**
	 * 通知销售组折价销售
	 */
	public void offSell();

	/**
	 * 通知库存组清仓处理
	 */
	public void clearStock();
}