/**
 * 
 */
package pattern.Mediator.demo3;

/**
 * �����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public class Stock {

	// ԭʼ���
	private int computerNumber = 100;

	private Purchase purchase;// �ɹ���
	private Sale sale;// ������

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}
	
	/**
	 * ���ӿ�����
	 * 
	 * @param number
	 *            ����
	 */
	public void increase(int number) {
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
	 * <p>
	 * <li>�ɹ���Ա���ٲɹ�
	 * <li>������ԱҪ��������
	 */
	public void clearStock() {
		log("����������Ϊ " + computerNumber);
		sale.offSale();// �ۼ�����
		purchase.refuse2BuyComputer();// ���ٲɹ�
	}
	
	private static void log(String message) {
		System.out.println("������顿" + message);
	}
}