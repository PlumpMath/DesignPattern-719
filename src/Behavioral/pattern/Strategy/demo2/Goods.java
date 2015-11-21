/**
 * 
 */
package pattern.Strategy.demo2;

/**
 * 商品类
 * <p>
 * 环境角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-30
 */
public class Goods {

	private double price;// 单价
	private int amount;// 数量
	
	private DiscountStrategy strategy;// 折扣策略
	
	/**
	 * @param price
	 *            单价
	 * @param amount
	 *            数量
	 */
	public Goods(double price, int amount) {
		this.price = price;
		this.amount = amount;
		this.strategy = new NoDiscountStrategy();// 默认无折扣
	}

	/**
	 * 设置折扣策略
	 * 
	 * @param strategy
	 *            折扣策略
	 */
	public void setStrategy(DiscountStrategy strategy) {
		this.strategy = strategy;
	}
	
	/**
	 * 商品原价
	 */
	public double price() {
		return price * amount;
	}

	/**
	 * 商品打完折之后的价格
	 */
	public double priceDiscounted() {
		return price() - strategy.discount(price, amount);
	}
	
	public String toString() {
		return "原价：" + price() + "  打完折后的价格：" + priceDiscounted();
	}
}
