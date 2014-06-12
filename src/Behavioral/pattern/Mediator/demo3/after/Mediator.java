/**
 * 
 */
package pattern.Mediator.demo3.after;

/**
 * ��ͣ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public class Mediator implements IMediator {

	private Purchase purchase;// �ɹ���
	private Sale sale;// ������
	private Stock stock;// �����

	private Purchase getPurchase() {
		return purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	private Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

	private Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}
	
	/**
	 * ��������Э�������������Ϊ
	 *
	 * @see pattern.pattern.Mediator.demo2.after.AbstractMediator#execute(java.lang.String, int)
	 */
	public void execute(String command, int number) {
		if (command.equals("purchase.buy")) { // �ɹ�����
			buyComputer(number);
		} else if (command.equals("sale.sell")) { // ���۵���
			sellComputer(number);
		} else if (command.equals("sale.offsell")) { // �ۼ�����
			offSell();
		} else if (command.equals("stock.clear")) { // ��ִ���
			clearStock();
		}
	}

	/**
	 * �ɹ�ָ�������ĵ���
	 * 
	 * @param number
	 *            ����
	 */
	private void buyComputer(int number) {
		// �����������Ϣ�������������Ĳɹ�����
		int saleStatus = getSale().getSaleStatus();// ���Ե��������
		if (saleStatus > 80) {
			getSale().log("����������ã��ɹ����� " + number + " ̨");
			getStock().increase(number);// ���ӿ��
		} else {
			getSale().log("����������ã��ɹ�����(�۰�ɹ�) " + number / 2 + " ̨");
			getStock().increase(number / 2);// ���ӿ��
		}
	}

	/**
	 * ����ָ�������ĵ���
	 * 
	 * @param number
	 *            ����
	 */
	private void sellComputer(int number) {
		// ������������������òɹ���ȥ�ɹ�
		if (getStock().getStockNumber() < number) {
			getPurchase().buyComputer(number);
		}
		getSale().log("���۵��� " + number + " ̨");
		getStock().decrease(number);
	}

	/**
	 * �ۼ�����
	 */
	private void offSell() {
		getSale().log("��ʼ�ۼ����۵��� " + getStock().getStockNumber() + " ̨");
	}

	/**
	 * ������
	 * <p>
	 * <li>�ɹ���Ա���ٲɹ�
	 * <li>������ԱҪ��������
	 */
	private void clearStock() {
		getStock().log("����������Ϊ " + getStock().getStockNumber());
		getSale().offSale();// �ۼ�����
		getPurchase().refuse2BuyComputer();// ���ٲɹ�
	}
}