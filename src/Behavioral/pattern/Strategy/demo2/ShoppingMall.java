/**
 * 
 */
package pattern.Strategy.demo2;

/**
 * �̳�
 * <p>
 * �ͻ��˽�ɫ���������Ʒ�趨���۲��ԡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-30
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