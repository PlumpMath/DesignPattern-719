/**
 * 
 */
package pattern.Mediator.demo1.after;

/**
 * ����
 * <p>
 * ����ͬ�����ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public class USA extends Country {

	private double imports = 0;// �����ܶ�
	private double exports = 0;// �����ܶ�

	public USA(WTO wto) {
		super(wto);
		// ע�ᵽWTO��
		wto.setUSA(this);
	}

	/**
	 * ���й�����ָ�����Ļ���
	 * 
	 * @param amount
	 *            ���
	 */
	public void importsFromChina(double amount) {
		log("���й����� " + amount + " ��Ԫ�Ļ���.");
		getWTO().trade("usa.import", amount);
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
		getWTO().trade("usa.export", amount);
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
	public void statistics() {
		log("�����ܼ� " + exports + " ��Ԫ");
		log("�����ܼ� " + imports + " ��Ԫ");
	}
}