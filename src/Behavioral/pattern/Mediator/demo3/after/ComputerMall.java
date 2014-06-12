/**
 * 
 */
package pattern.Mediator.demo3.after;

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
		Mediator mediator = new Mediator();
		Purchase purchase = new Purchase(mediator);
		Sale sale = new Sale(mediator);
		Stock stock = new Stock(mediator);
		
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