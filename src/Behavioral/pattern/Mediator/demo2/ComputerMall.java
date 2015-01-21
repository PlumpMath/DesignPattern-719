/**
 * 
 */
package pattern.Mediator.demo2;

/**
 * 电脑商场(客户端类)
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-8
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

		// 采购人员采购电脑
		System.out.println("------采购人员采购电脑--------");
		purchase.buyComputer(100);
		// 销售人员销售电脑
		System.out.println("\n------销售人员销售电脑--------");
		sale.sellComputer(5);
		// 库房管理人员管理库存
		System.out.println("\n------库房管理人员清库处理--------");
		stock.clearStock();
	}
}