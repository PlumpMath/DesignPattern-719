package pattern.Strategy.demo2;

/**
 * 限额折扣策略
 * <p>
 * 这是一个装饰类，用于装饰具体折扣策略。
 * <p>
 * 一般而言，它只适用于客户端在这几种算法中选择一种的情形
 * 而不适用于同时需要几种算法的情形。
 * 比如：不管用那种折扣策略，总的折扣不能超过某个限额。
 * 这时单纯的策略模式就不行了，需要进一步使用装饰模式。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-30
 */
public class LimitedDiscountStrategy implements DiscountStrategy {
	
	private double limited;// 限额

	private DiscountStrategy strategy;// 具体折扣策略

	public LimitedDiscountStrategy(double limited, DiscountStrategy strategy) {
		this.limited = limited;
		this.strategy = strategy;
	}

	/**
	 * 折扣总金额最多为限额
	 * 
	 * @see pattern.Strategy.demo2.DiscountStrategy#discount(double, int)
	 */
	@Override
	public double discount(double price, int amount) {
		double discount = strategy.discount(price, amount);
		return discount > limited ? limited : discount;
	}
}