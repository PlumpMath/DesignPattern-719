package pattern.Strategy.demo2;

/**
 * 无折扣策略
 * <p>
 * 具体策略角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-30
 */
public class NoDiscountStrategy implements DiscountStrategy {

	/**
	 * 不打折，直接返回0
	 * 
	 * @see pattern.Strategy.demo2.DiscountStrategy#discount(double, int)
	 */
	@Override
	public double discount(double price, int amount) {
		return 0;
	}
}