/**
 * 
 */
package pattern.Mediator.demo1.after;

/**
 * WTO
 * <p>
 * ��ͣ�߽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public class WTO {

	private China china;// �й�
	private USA usa;// ����

	/**
	 * ͨ���������ó�׻(�¼�����)
	 * 
	 * @param command
	 *            ó������(�;���ͬ�����һ��Լ��)
	 * @param amount
	 *            ó�׽��
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