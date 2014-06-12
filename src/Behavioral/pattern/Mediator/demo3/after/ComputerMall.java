/**
 * 
 */
package pattern.Mediator.demo3.after;

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
		Mediator mediator = new Mediator();
		Purchase purchase = new Purchase(mediator);
		Sale sale = new Sale(mediator);
		Stock stock = new Stock(mediator);
		
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