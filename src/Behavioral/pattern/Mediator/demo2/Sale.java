/**
 * 
 */
package pattern.Mediator.demo2;

import java.util.Random;

/**
 * ������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public class Sale {

	private Stock stock;// �����
	private Purchase purchase;// �ɹ���

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	/**
	 * ����ָ�������ĵ���
	 * 
	 * @param number
	 *            ����
	 */
	public void sellComputer(int number) {
		// ������������������òɹ���ȥ�ɹ�
		if (stock.getStockNumber() < number) { 
			purchase.buyComputer(number);
		}
		log("���۵��� " + number + " ̨");
		stock.decrease(number);
	}

	/**
	 * ����״����0��100֮��仯��0���������û������100����ǳ�����
	 */
	public int getSaleStatus() {
		int saleStatus = new Random().nextInt(100);
		log("�����������Ϊ " + saleStatus);
		return saleStatus;
	}

	/**
	 * �ۼ�����
	 */
	public void offSale() {
		log("��ʼ�ۼ����۵��� " + stock.getStockNumber() + " ̨");
	}
	
	private static void log(String message) {
		System.out.println("�������顿" + message);
	}
}