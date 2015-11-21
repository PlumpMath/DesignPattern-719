package pattern.Strategy.demo2;

/**
 * 百分比折扣策略
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-30
 */
public class PercentageStrategy implements DiscountStrategy {

	private double percent;

	/**
	 * @param percent
	 *            折扣百分比(0-1)
	 */
	public PercentageStrategy(double percent) {
		this.percent = percent;
	}

	/**
	 * 每件商品都按百分比打折
	 * 
	 * @see pattern.Strategy.demo2.DiscountStrategy#discount(double, int)
	 */
	@Override
	public double discount(double price, int amount) {
		return price * amount * percent;
	}
}
