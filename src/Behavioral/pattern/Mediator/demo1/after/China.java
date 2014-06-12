/**
 * 
 */
package pattern.Mediator.demo1.after;

/**
 * �й�
 * <p>
 * ����ͬ�����ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public class China extends Country {

	private double importAmount = 0;// �����ܶ�
	private double exportAmount = 0;// �����ܶ�

	public China(WTO wto) {
		super(wto);
		// ע�ᵽWTO��
		wto.setChina(this);
	}

	/**
	 * ����������ָ�����Ļ���
	 * 
	 * @param amount
	 *            ���
	 */
	public void importsFromUSA(double amount) {
		log("���������� " + amount + " ��Ԫ�Ļ���.");
		// ֱ��ͨ��WTO���н���ó��
		getWTO().trade("china.import", amount);
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
		// ֱ��ͨ��WTO���г���ó��
		getWTO().trade("china.export", amount);
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