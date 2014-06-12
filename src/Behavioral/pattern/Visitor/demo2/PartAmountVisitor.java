/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * �������������
 * <p>
 * ���ڼ��㶩���и����������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-20
 */
public class PartAmountVisitor implements Visitor {

	private int cpus = 0;// CPU����
	private int cases = 0;// ��������
	private int mainboards = 0;// ��������
	private int harddisks = 0;// Ӳ������
	private int integratedBoards = 0;// ������������
	private int pcs = 0;// PC����

	/**
	 * CPU����
	 */
	public int getCpus() {
		return cpus;
	}

	/**
	 * ��������
	 */
	public int getCases() {
		return cases;
	}

	/**
	 * ��������
	 */
	public int getMainboards() {
		return mainboards;
	}

	/**
	 * Ӳ������
	 */
	public int getHarddisks() {
		return harddisks;
	}

	/**
	 * ������������
	 */
	public int getIntegratedBoards() {
		return integratedBoards;
	}

	/**
	 * PC����
	 */
	public int getPcs() {
		return pcs;
	}

	/**
	 * �����������
	 */
	public int getPartsAmount() {
		return cpus + cases + mainboards + harddisks;
	}

	@Override
	public void visitCPU(CPU cpu) {
		cpus++;
	}

	@Override
	public void visitCase(Case e) {
		cases++;
	}

	@Override
	public void visitHardDisk(HardDisk hardDisk) {
		harddisks++;
	}

	@Override
	public void visitIntegratedBoard(IntegratedBoard integratedboard) {
		integratedBoards++;
	}

	@Override
	public void visitMainboard(Mainboard mainboard) {
		mainboards++;
	}

	@Override
	public void visitPC(PC pc) {
		pcs++;
	}
}