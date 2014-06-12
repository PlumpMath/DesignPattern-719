/**
 * 
 */
package pattern.Mediator.demo3;

/**
 * �ɹ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public class Purchase {

	private Stock stock;// �����
	private Sale sale;// ������
	
	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

	/**
	 * �ɹ�ָ�������ĵ���
	 * 
	 * @param number
	 *            ����
	 */
	public void buyComputer(int number) {
		// �����������Ϣ�������������Ĳɹ�����
		int saleStatus = sale.getSaleStatus();// ���Ե��������
		if (saleStatus > 80) {
			log("����������ã��ɹ����� " + number + " ̨");
			stock.increase(number);// ���ӿ��
		} else {
			log("����������ã��ɹ�����(�۰�ɹ�) " + number / 2 + " ̨");
			stock.increase(number / 2);// ���ӿ��
		}
	}

	/**
	 * �ܾ��ɹ�����
	 */
	public void refuse2BuyComputer() {
		log("���ٲɹ�����");
	}

	private static void log(String message) {
		System.out.println("���ɹ��顿" + message);
	}
}