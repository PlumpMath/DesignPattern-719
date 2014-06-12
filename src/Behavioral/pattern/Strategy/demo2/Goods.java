/**
 * 
 */
package pattern.Strategy.demo2;

/**
 * ��Ʒ��
 * <p>
 * ������ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-30
 */
public class Goods {

	private double price;// ����
	private int amount;// ����
	
	private DiscountStrategy strategy;// �ۿ۲���
	
	/**
	 * @param price
	 *            ����
	 * @param amount
	 *            ����
	 */
	public Goods(double price, int amount) {
		this.price = price;
		this.amount = amount;
		this.strategy = new NoDiscountStrategy();// Ĭ�����ۿ�
	}

	/**
	 * �����ۿ۲���
	 * 
	 * @param strategy
	 *            �ۿ۲���
	 */
	public void setStrategy(DiscountStrategy strategy) {
		this.strategy = strategy;
	}
	
	/**
	 * ��Ʒԭ��
	 */
	public double price() {
		return price * amount;
	}

	/**
	 * ��Ʒ������֮��ļ۸�
	 */
	public double priceDiscounted() {
		return price() - strategy.discount(price, amount);
	}
	
	public String toString() {
		return "ԭ�ۣ�" + price() + "  �����ۺ�ļ۸�" + priceDiscounted();
	}
}