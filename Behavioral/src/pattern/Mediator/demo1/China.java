/**
 * 
 */
package pattern.Mediator.demo1;

/**
 * 中国
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-8
 */
public class China {

	private double importAmount = 0;// 进口总额
	private double exportAmount = 0;// 出口总额

	private USA usa;// 贸易伙伴 美国

	/**
	 * 从美国进口指定金额的货物
	 * 
	 * @param amount
	 *            金额
	 */
	public void importsFromUSA(double amount) {
		log("向美国进口 " + amount + " 美元的货物.");
		if (getUSA().acceptExports(amount)) {
			increaseImportAmount(amount);
			getUSA().increaseExports(amount);
		}
		System.out.println();
	}

	/**
	 * 向美国出口指定金额的货物
	 * 
	 * @param amount
	 *            金额
	 */
	public void exports2USA(double amount) {
		log("向美国出口 " + amount + " 美元的货物.");
		if (getUSA().acceptImports(amount)) {
			increaseExportAmount(amount);
			getUSA().increaseImports(amount);
		}
		System.out.println();
	}

	/**
	 * 增加进口总额
	 * 
	 * @param amount
	 *            金额
	 */
	public void increaseImportAmount(double amount) {
		importAmount += amount;
	}

	/**
	 * 增加出口总额
	 * 
	 * @param amount
	 *            金额
	 */
	public void increaseExportAmount(double amount) {
		exportAmount += amount;
	}

	private USA getUSA() {
		return usa;
	}

	public void setUSA(USA usa) {
		this.usa = usa;
	}

	private static void log(String message) {
		System.out.println("【中国】" + message);
	}

	/**
	 * 打印统计信息
	 */
	public void statistics() {
		log("出口总计 " + exportAmount + " 美元");
		log("进口总计 " + importAmount + " 美元");
	}
}
