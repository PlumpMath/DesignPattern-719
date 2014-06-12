package pattern.Strategy.demo2;

/**
 * �ٷֱ��ۿ۲���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-30
 */
public class PercentageStrategy implements DiscountStrategy {

	private double percent;

	/**
	 * @param percent
	 *            �ۿ۰ٷֱ�(0-1)
	 */
	public PercentageStrategy(double percent) {
		this.percent = percent;
	}

	/**
	 * ÿ����Ʒ�����ٷֱȴ���
	 * 
	 * @see pattern.Strategy.demo2.DiscountStrategy#discount(double, int)
	 */
	@Override
	public double discount(double price, int amount) {
		return price * amount * percent;
	}
}