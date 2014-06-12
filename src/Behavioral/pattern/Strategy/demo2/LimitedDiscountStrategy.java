package pattern.Strategy.demo2;

/**
 * �޶��ۿ۲���
 * <p>
 * ����һ��װ���࣬����װ�ξ����ۿ۲��ԡ�
 * <p>
 * һ����ԣ���ֻ�����ڿͻ������⼸���㷨��ѡ��һ�ֵ�����
 * ����������ͬʱ��Ҫ�����㷨�����Ρ�
 * ���磺�����������ۿ۲��ԣ��ܵ��ۿ۲��ܳ���ĳ���޶
 * ��ʱ�����Ĳ���ģʽ�Ͳ����ˣ���Ҫ��һ��ʹ��װ��ģʽ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-30
 */
public class LimitedDiscountStrategy implements DiscountStrategy {
	
	private double limited;// �޶�

	private DiscountStrategy strategy;// �����ۿ۲���

	public LimitedDiscountStrategy(double limited, DiscountStrategy strategy) {
		this.limited = limited;
		this.strategy = strategy;
	}

	/**
	 * �ۿ��ܽ�����Ϊ�޶�
	 * 
	 * @see pattern.Strategy.demo2.DiscountStrategy#discount(double, int)
	 */
	@Override
	public double discount(double price, int amount) {
		double discount = strategy.discount(price, amount);
		return discount > limited ? limited : discount;
	}
}