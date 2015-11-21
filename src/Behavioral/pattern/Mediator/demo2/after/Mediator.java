/**
 * 
 */
package pattern.Mediator.demo2.after;

/**
 * 调停者
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-8
 */
public class Mediator implements IMediator {

	private Purchase purchase;// 采购组
	private Sale sale;// 销售组
	private Stock stock;// 库存组

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
	 * 采购指定数量的电脑
	 * 
	 * @param number
	 *            数量
	 */
	public void buyComputer(int number) {
		// 会根据销售信息分析决定真正的采购数量
		int saleStatus = getSale().getSaleStatus();// 电脑的销售情况
		if (saleStatus > 80) {
			getSale().log("销售情况良好，采购电脑 " + number + " 台");
			getStock().increase(number);// 增加库存
		} else {
			getSale().log("销售情况不好，采购电脑(折半采购) " + number / 2 + " 台");
			getStock().increase(number / 2);// 增加库存
		}
	}

	/**
	 * 销售指定数量的电脑
	 * 
	 * @param number
	 *            数量
	 */
	public void sellComputer(int number) {
		// 库存数量不够销售则让采购组去采购
		if (getStock().getStockNumber() < number) {
			getPurchase().buyComputer(number);
		}
		getSale().log("销售电脑 " + number + " 台");
		getStock().decrease(number);
	}

	/**
	 * 折价销售
	 */
	public void offSell() {
		getSale().log("开始折价销售电脑 " + getStock().getStockNumber() + " 台");
	}

	/**
	 * 清理库存
	 * <p>
	 * <li>采购人员不再采购
	 * <li>销售人员要尽快销售
	 */
	public void clearStock() {
		getStock().log("清理库存数量为 " + getStock().getStockNumber());
		getSale().offSale();// 折价销售
		getPurchase().refuse2BuyComputer();// 不再采购
	}
}
