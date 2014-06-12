package pattern.Strategy.demo2;

/**
 * ͳһ�ۿ۽�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-30
 */
public class FlatRateStrategy implements DiscountStrategy {

	private double discount;
	
	/**
	 * @param discount
	 *            ÿ����Ʒ��ͳһ�ۿ۽��
	 */
	public FlatRateStrategy(double discount) {
		this.discount = discount;
	}

	/**
	 * ÿ����Ʒ������ͳһ�����ۿ�
	 * 
	 * @see pattern.Strategy.demo2.DiscountStrategy#discount(double, int)
	 */
	@Override
	public double discount(double price, int amount) {
		return discount * amount;
	}
}