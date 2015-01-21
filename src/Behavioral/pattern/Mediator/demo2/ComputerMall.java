/**
 * 
 */
package pattern.Mediator.demo2;

/**
 * �����̳�(�ͻ�����)
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public class ComputerMall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Purchase purchase = new Purchase();
		Sale sale = new Sale();
		Stock stock = new Stock();

		purchase.setSale(sale);
		purchase.setStock(stock);

		sale.setPurchase(purchase);
		sale.setStock(stock);

		stock.setPurchase(purchase);
		stock.setSale(sale);

		// �ɹ���Ա�ɹ�����
		System.out.println("------�ɹ���Ա�ɹ�����--------");
		purchase.buyComputer(100);
		// ������Ա���۵���
		System.out.println("\n------������Ա���۵���--------");
		sale.sellComputer(5);
		// �ⷿ������Ա������
		System.out.println("\n------�ⷿ������Ա��⴦��--------");
		stock.clearStock();
	}
}