package pattern.Strategy.demo2;

/**
 * �ۿ۲��Խӿ�
 * <p>
 * ������Խ�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-30
 */
public interface DiscountStrategy {
	
	/**
	 * �����ۿ�
	 * 
	 * @param price
	 *            ����
	 * @param amount
	 *            ����
	 */
	public double discount(double price, int amount);
}