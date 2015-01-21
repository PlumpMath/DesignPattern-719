/**
 * 
 */
package pattern.Mediator.demo2.after;

/**
 * 采购组
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-8
 */
public class Purchase extends AbstractColleague {

	public Purchase(Mediator mediator) {
		super(mediator);
		// 将Purchase对象注册到Mediator
		mediator.setPurchase(this);
	}

	/**
	 * 采购指定数量的电脑
	 * 
	 * @param number
	 *            数量
	 */
	public void buyComputer(int number) {
		// 涉及和其他对象通信的操作都交给Mediator完成
		getMediator().buyComputer(number);
	}

	/**
	 * 拒绝采购电脑
	 */
	public void refuse2BuyComputer() {
		// 只涉及到自身对象的操作可以不通过Mediator完成
		log("不再采购电脑");
	}

	/**
	 * 打印日志信息
	 */
	public void log(String message) {
		System.out.println("【采购组】" + message);
	}
}