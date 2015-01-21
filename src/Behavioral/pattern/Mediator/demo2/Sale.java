/**
 * 
 */
package pattern.Mediator.demo2;

import java.util.Random;

/**
 * 销售组
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-8
 */
public class Sale {

	private Stock stock;// 库存组
	private Purchase purchase;// 采购组

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	/**
	 * 销售指定数量的电脑
	 * 
	 * @param number
	 *            数量
	 */
	public void sellComputer(int number) {
		// 库存数量不够销售则让采购组去采购
		if (stock.getStockNumber() < number) { 
			purchase.buyComputer(number);
		}
		log("销售电脑 " + number + " 台");
		stock.decrease(number);
	}

	/**
	 * 销售状况：0—100之间变化，0代表根本就没人卖，100代表非常畅销
	 */
	public int getSaleStatus() {
		int saleStatus = new Random().nextInt(100);
		log("电脑销售情况为 " + saleStatus);
		return saleStatus;
	}

	/**
	 * 折价销售
	 */
	public void offSale() {
		log("开始折价销售电脑 " + stock.getStockNumber() + " 台");
	}
	
	private static void log(String message) {
		System.out.println("【销售组】" + message);
	}
}