/**
 * 
 */
package pattern.Mediator.demo3;

/**
 * 采购组
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-8
 */
public class Purchase {

	private Stock stock;// 库存组
	private Sale sale;// 销售组
	
	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

	/**
	 * 采购指定数量的电脑
	 * 
	 * @param number
	 *            数量
	 */
	public void buyComputer(int number) {
		// 会根据销售信息分析决定真正的采购数量
		int saleStatus = sale.getSaleStatus();// 电脑的销售情况
		if (saleStatus > 80) {
			log("销售情况良好，采购电脑 " + number + " 台");
			stock.increase(number);// 增加库存
		} else {
			log("销售情况不好，采购电脑(折半采购) " + number / 2 + " 台");
			stock.increase(number / 2);// 增加库存
		}
	}

	/**
	 * 拒绝采购电脑
	 */
	public void refuse2BuyComputer() {
		log("不再采购电脑");
	}

	private static void log(String message) {
		System.out.println("【采购组】" + message);
	}
}