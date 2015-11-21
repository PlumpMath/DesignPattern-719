/**
 * 
 */
package pattern.Strategy.demo2;

/**
 * 商场
 * <p>
 * 客户端角色，负责对商品设定打折策略。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-30
 */
public class ShoppingMall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Goods goods = new Goods(100, 10);
		System.out.println(goods);
		goods.setStrategy(new FlatRateStrategy(5));
		System.out.println(goods);
		goods.setStrategy(new PercentageStrategy(0.15));
		System.out.println(goods);
		goods.setStrategy(new LimitedDiscountStrategy(100,
				new FlatRateStrategy(5)));
		System.out.println(goods);
		goods.setStrategy(new LimitedDiscountStrategy(100,
				new PercentageStrategy(0.15)));
		System.out.println(goods);
	}
}
