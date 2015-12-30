package pattern.Strategy.demo2;

/**
 * 统一折扣金额策略
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-30
 */
public class FlatRateStrategy implements DiscountStrategy {

	private double discount;
	
	/**
	 * @param discount
	 *            每个商品的统一折扣金额
	 */
	public FlatRateStrategy(double discount) {
		this.discount = discount;
	}

	/**
	 * 每个商品都会有统一金额的折扣
	 * 
	 * @see pattern.Strategy.demo2.DiscountStrategy#discount(double, int)
	 */
	@Override
	public double discount(double price, int amount) {
		return discount * amount;
	}
}
