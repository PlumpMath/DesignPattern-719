package pattern.Mediator.demo3.after;

import java.util.Random;

/**
 * 销售组
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-8
 */
public class Sale  extends AbstractColleague { 
	
	public Sale(Mediator mediator) {
		super(mediator);
		// 将Sale对象注册到Mediator
		mediator.setSale(this);
	}

	/**
	 * 销售指定数量的电脑
	 * 
	 * @param number
	 *            数量
	 */
	public void sellComputer(int number) {
		// 涉及和其他对象通信的操作都交给Mediator完成
		getMediator().execute("sale.sell", number);
	}

	/**
	 * 销售状况：0—100之间变化，0代表根本就没人卖，100代表非常畅销
	 */
	public int getSaleStatus() {
		// 只涉及到自身对象的操作可以不通过Mediator完成
		int saleStatus = new Random().nextInt(100);
		log("电脑销售情况为 " + saleStatus);
		return saleStatus;
	}

	/**
	 * 折价销售
	 */
	public void offSale() {
		// 涉及和其他对象通信的操作都交给Mediator完成
		getMediator().execute("sale.offsell", 0);
	}

	/**
	 * 打印日志信息
	 */
	public void log(String message) {
		System.out.println("【销售组】" + message);
	}
}