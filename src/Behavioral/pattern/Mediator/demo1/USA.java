/**
 * 
 */
package pattern.Mediator.demo1;

/**
 * ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public class USA {
	
	private double imports = 0;// �����ܶ�
	private double exports = 0;// �����ܶ�

	private China china;// ó�׻�� �й�

	/**
	 * ���й�����ָ�����Ļ���
	 * 
	 * @param amount
	 *            ���
	 */
	public void importsFromChina(double amount) {
		log("���й����� " + amount + " ��Ԫ�Ļ���.");
		increaseImports(amount);
		getChina().increaseExportAmount(amount);
		log("�й��϶�ͬ��.");
		System.out.println();
	}

	/**
	 * ���й�����ָ�����Ļ���
	 * 
	 * @param amount
	 *            ���
	 */
	public void exports2China(double amount) {
		log("���й����� " + amount + " ��Ԫ�Ļ���.");
		increaseExports(amount);
		getChina().increaseImportAmount(amount);
		log("�й��϶�ͬ��.");
		System.out.println();
	}

	/**
	 * ���ӽ����ܶ�
	 * 
	 * @param amount
	 *            ���
	 */
	public void increaseImports(double amount) {
		imports += amount;
	}

	/**
	 * ���ӳ����ܶ�
	 * 
	 * @param amount
	 *            ���
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
	 * �Ƿ���ܽ����ܶ�
	 * 
	 * @param amount
	 *            ���
	 */
	public boolean acceptImports(double amount) {
		boolean accepted = amount < 1000 && imports < 5000;
		log("����" + (accepted ? "ͬ��" : "�ܾ�") + "���� " + amount + " ��Ԫ�Ļ���.");
		return accepted;
	}

	/**
	 * �Ƿ���ܳ����ܶ�
	 * 
	 * @param amount
	 *            ���
	 */
	public boolean acceptExports(double amount) {
		boolean accepted = amount > 1000 && exports < 10000;
		log("����" + (accepted ? "ͬ��" : "�ܾ�") + "���� " + amount + " ��Ԫ�Ļ���.");
		return accepted;
	}
	
	private static void log(String message) {
		System.out.println("��������" + message);
	}
	
	/**
	 * ��ӡͳ����Ϣ
	 */
	public void statistics(){
		log("�����ܼ� " + exports + " ��Ԫ");
		log("�����ܼ� " + imports + " ��Ԫ");
	}
}