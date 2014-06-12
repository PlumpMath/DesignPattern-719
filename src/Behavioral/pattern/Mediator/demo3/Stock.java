/**
 * 
 */
package pattern.Mediator.demo3;

/**
 * 库存组
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-8
 */
public class Stock {

	// 原始库存
	private int computerNumber = 100;

	private Purchase purchase;// 采购组
	private Sale sale;// 销售组

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}
	
	/**
	 * 增加库存电脑
	 * 
	 * @param number
	 *            数量
	 */
	public void increase(int number) {
		computerNumber += number;
		log("库存数量为 " + computerNumber);
	}
	
	/**
	 * 减少库存电脑
	 * 
	 * @param number
	 *            数量
	 */
	public void decrease(int number) {
		computerNumber -= number;
		log("库存数量为 " + computerNumber);
	}

	/**
	 * 返回库存电脑数量
	 */
	public int getStockNumber() {
		return computerNumber;
	}

	/**
	 * 清理库存
	 * <p>
	 * <li>采购人员不再采购
	 * <li>销售人员要尽快销售
	 */
	public void clearStock() {
		log("清理库存数量为 " + computerNumber);
		sale.offSale();// 折价销售
		purchase.refuse2BuyComputer();// 不再采购
	}
	
	private static void log(String message) {
		System.out.println("【库存组】" + message);
	}
}