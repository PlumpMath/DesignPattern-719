/**
 * 
 */
package pattern.Mediator.demo1;

/**
 * 美国
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-8
 */
public class USA {
	
	private double imports = 0;// 进口总额
	private double exports = 0;// 出口总额

	private China china;// 贸易伙伴 中国

	/**
	 * 从中国进口指定金额的货物
	 * 
	 * @param amount
	 *            金额
	 */
	public void importsFromChina(double amount) {
		log("向中国进口 " + amount + " 美元的货物.");
		increaseImports(amount);
		getChina().increaseExportAmount(amount);
		log("中国肯定同意.");
		System.out.println();
	}

	/**
	 * 向中国出口指定金额的货物
	 * 
	 * @param amount
	 *            金额
	 */
	public void exports2China(double amount) {
		log("向中国出口 " + amount + " 美元的货物.");
		increaseExports(amount);
		getChina().increaseImportAmount(amount);
		log("中国肯定同意.");
		System.out.println();
	}

	/**
	 * 增加进口总额
	 * 
	 * @param amount
	 *            金额
	 */
	public void increaseImports(double amount) {
		imports += amount;
	}

	/**
	 * 增加出口总额
	 * 
	 * @param amount
	 *            金额
	 */
	public void increaseExports(double amount) {
		exports += amount;
	}

	private China getChina() {
		return china;
	}

	public void setChina(China china) {
		this.china = china;
	}

	/**
	 * 是否接受进口总额
	 * 
	 * @param amount
	 *            金额
	 */
	public boolean acceptImports(double amount) {
		boolean accepted = amount < 1000 && imports < 5000;
		log("美国" + (accepted ? "同意" : "拒绝") + "进口 " + amount + " 美元的货物.");
		return accepted;
	}

	/**
	 * 是否接受出口总额
	 * 
	 * @param amount
	 *            金额
	 */
	public boolean acceptExports(double amount) {
		boolean accepted = amount > 1000 && exports < 10000;
		log("美国" + (accepted ? "同意" : "拒绝") + "出口 " + amount + " 美元的货物.");
		return accepted;
	}
	
	private static void log(String message) {
		System.out.println("【美国】" + message);
	}
	
	/**
	 * 打印统计信息
	 */
	public void statistics(){
		log("出口总计 " + exports + " 美元");
		log("进口总计 " + imports + " 美元");
	}
}