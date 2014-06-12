package pattern.Strategy.demo2;

/**
 * 折扣策略接口
 * <p>
 * 抽象策略角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-30
 */
public interface DiscountStrategy {
	
	/**
	 * 计算折扣
	 * 
	 * @param price
	 *            单价
	 * @param amount
	 *            数量
	 */
	public double discount(double price, int amount);
}