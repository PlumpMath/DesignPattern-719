/**
 * 
 */
package pattern.Mediator.demo1.after;

/**
 * WTO
 * <p>
 * 调停者角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-8
 */
public class WTO {

	private China china;// 中国
	private USA usa;// 美国

	/**
	 * 通过命令进行贸易活动(事件方法)
	 * 
	 * @param command
	 *            贸易命令(和具体同事类的一种约定)
	 * @param amount
	 *            贸易金额
	 */
	public void trade(String command, double amount) {
		if (command.equals("china.import")) {
			chinaImportFromUSA(amount);
		} else if (command.equals("china.export")) {
			chinaExport2USA(amount);
		} else if (command.equals("usa.import")) {
			usaImportFromChina(amount);
		} else if (command.equals("usa.export")) {
			usaExport2China(amount);
		}
	}

	private void chinaImportFromUSA(double amount) {
		if (getUSA().acceptExports(amount)) {
			getChina().increaseImportAmount(amount);
			getUSA().increaseExports(amount);
		}
	}

	private void chinaExport2USA(double amount) {
		if (getUSA().acceptImports(amount)) {
			getChina().increaseExportAmount(amount);
			getUSA().increaseImports(amount);
		}
	}

	private void usaImportFromChina(double amount) {
		getUSA().increaseImports(amount);
		getChina().increaseExportAmount(amount);
	}

	private void usaExport2China(double amount) {
		getUSA().increaseExports(amount);
		getChina().increaseImportAmount(amount);
	}

	private China getChina() {
		return china;
	}

	public void setChina(China china) {
		this.china = china;
	}

	private USA getUSA() {
		return usa;
	}

	public void setUSA(USA usa) {
		this.usa = usa;
	}
}
