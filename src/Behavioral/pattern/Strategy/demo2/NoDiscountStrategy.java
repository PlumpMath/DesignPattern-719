package pattern.Strategy.demo2;

/**
 * ���ۿ۲���
 * <p>
 * ������Խ�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-30
 */
public class NoDiscountStrategy implements DiscountStrategy {

	/**
	 * �����ۣ�ֱ�ӷ���0
	 * 
	 * @see pattern.Strategy.demo2.DiscountStrategy#discount(double, int)
	 */
	@Override
	public double discount(double price, int amount) {
		return 0;
	}
}