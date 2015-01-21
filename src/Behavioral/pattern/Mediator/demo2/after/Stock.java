/**
 * 
 */
package pattern.Mediator.demo2.after;

/**
 * �����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public class Stock extends AbstractColleague {

	// ԭʼ���
	private int computerNumber = 100;

	public Stock(Mediator mediator) {
		super(mediator);
		// ��Stock����ע�ᵽMediator
		mediator.setStock(this);
	}

	/**
	 * ���ӿ�����
	 * 
	 * @param number
	 *            ����
	 */
	public void increase(int number) {
		// ֻ�漰���������Ĳ������Բ�ͨ��Mediator���
		computerNumber += number;
		log("�������Ϊ " + computerNumber);
	}

	/**
	 * ���ٿ�����
	 * 
	 * @param number
	 *            ����
	 */
	public void decrease(int number) {
		// ֻ�漰���������Ĳ������Բ�ͨ��Mediator���
		computerNumber -= number;
		log("�������Ϊ " + computerNumber);
	}

	/**
	 * ���ؿ���������
	 */
	public int getStockNumber() {
		return computerNumber;
	}

	/**
	 * ������
	 */
	public void clearStock() {
		// �漰����������ͨ�ŵĲ���������Mediator���
		getMediator().clearStock();
	}

	/**
	 * ��ӡ��־��Ϣ
	 */
	public void log(String message) {
		System.out.println("������顿" + message);
	}
}