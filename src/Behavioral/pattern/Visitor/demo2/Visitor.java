/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * �������ӿ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-20
 */
public interface Visitor {

	/**
	 * ���ʻ���
	 */
	public void visitCase(Case e);

	/**
	 * ����CPU
	 */
	public void visitCPU(CPU cpu);

	/**
	 * ��������
	 */
	public void visitMainboard(Mainboard mainboard);

	/**
	 * ����Ӳ��
	 */
	public void visitHardDisk(HardDisk hardDisk);

	/**
	 * ���ʼ�������
	 */
	public void visitIntegratedBoard(IntegratedBoard integratedboard);

	/**
	 * ����PC
	 */
	public void visitPC(PC pc);
}