/**
 * 
 */
package pattern.Mediator.demo1;

/**
 * �й�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public class China {

	private double importAmount = 0;// �����ܶ�
	private double exportAmount = 0;// �����ܶ�

	private USA usa;// ó�׻�� ����

	/**
	 * ����������ָ�����Ļ���
	 * 
	 * @param amount
	 *            ���
	 */
	public void importsFromUSA(double amount) {
		log("���������� " + amount + " ��Ԫ�Ļ���.");
		if (getUSA().acceptExports(amount)) {
			increaseImportAmount(amount);
			getUSA().increaseExports(amount);
		}
		System.out.println();
	}

	/**
	 * ����������ָ�����Ļ���
	 * 
	 * @param amount
	 *            ���
	 */
	public void exports2USA(double amount) {
		log("���������� " + amount + " ��Ԫ�Ļ���.");
		if (getUSA().acceptImports(amount)) {
			increaseExportAmount(amount);
			getUSA().increaseImports(amount);
		}
		System.out.println();
	}

	/**
	 * ���ӽ����ܶ�
	 * 
	 * @param amount
	 *            ���
	 */
	public void increaseImportAmount(double amount) {
		importAmount += amount;
	}

	/**
	 * ���ӳ����ܶ�
	 * 
	 * @param amount
	 *            ���
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
		System.out.println("���й���" + message);
	}

	/**
	 * ��ӡͳ����Ϣ
	 */
	public void statistics() {
		log("�����ܼ� " + exportAmount + " ��Ԫ");
		log("�����ܼ� " + importAmount + " ��Ԫ");
	}
}