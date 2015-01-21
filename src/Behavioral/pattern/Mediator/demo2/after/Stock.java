/**
 * 
 */
package pattern.Mediator.demo2.after;

/**
 * 库存组
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-8
 */
public class Stock extends AbstractColleague {

	// 原始库存
	private int computerNumber = 100;

	public Stock(Mediator mediator) {
		super(mediator);
		// 将Stock对象注册到Mediator
		mediator.setStock(this);
	}

	/**
	 * 增加库存电脑
	 * 
	 * @param number
	 *            数量
	 */
	public void increase(int number) {
		// 只涉及到自身对象的操作可以不通过Mediator完成
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
		// 只涉及到自身对象的操作可以不通过Mediator完成
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
	 */
	public void clearStock() {
		// 涉及和其他对象通信的操作都交给Mediator完成
		getMediator().clearStock();
	}

	/**
	 * 打印日志信息
	 */
	public void log(String message) {
		System.out.println("【库存组】" + message);
	}
}