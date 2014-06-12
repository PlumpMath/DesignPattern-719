/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * Ĭ�ϼ۸������
 * <p>
 * ����Ϊ��ͨ�û����㶩���۸�(ԭ�ۣ����ۿ�)
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-20
 */
public class DefaultPriceVisitor implements Visitor {

	// �ܼ�
	private double totalPrice = 0;

	@Override
	public void visitCPU(CPU cpu) {
		System.out.println("CPU ԭ�ۣ�" + cpu.getPrice());
		totalPrice += cpu.getPrice();
	}

	@Override
	public void visitCase(Case e) {
		System.out.println("Case ԭ�ۣ�" + e.getPrice());
		totalPrice += e.getPrice();
	}

	@Override
	public void visitHardDisk(HardDisk hardDisk) {
		System.out.println("HardDisk ԭ�ۣ�" + hardDisk.getPrice());
		totalPrice += hardDisk.getPrice();
	}

	@Override
	public void visitIntegratedBoard(IntegratedBoard integratedboard) {
		// �۸�������������ˣ��������岻�ټ���
		// do nothing
	}

	@Override
	public void visitMainboard(Mainboard mainboard) {
		System.out.println("Mainboard ԭ�ۣ�" + mainboard.getPrice());
		totalPrice += mainboard.getPrice();
	}

	@Override
	public void visitPC(PC pc) {
		// �۸�������������ˣ��������岻�ټ���
		// do nothing
	}

	/**
	 * �ܼ�
	 */
	public double getTotalPrice() {
		return totalPrice;
	}
}