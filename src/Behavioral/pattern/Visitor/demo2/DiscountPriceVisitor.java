/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * �����ۿۼ۸������
 * <p>
 * ���ڹ��ڴ���ʱ���㶩���۸�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-20
 */
public class DiscountPriceVisitor implements Visitor {

	private int number = 0;// �������
	private double totalPrice = 0;// �ܼ�

	@Override
	public void visitCPU(CPU cpu) {
		number++;
		totalPrice += cpu.getPrice();
	}

	@Override
	public void visitCase(Case e) {
		number++;
		totalPrice += e.getPrice();
	}

	@Override
	public void visitHardDisk(HardDisk hardDisk) {
		number++;
		totalPrice += hardDisk.getPrice();
	}

	@Override
	public void visitIntegratedBoard(IntegratedBoard integratedboard) {
		// �۸��������������������ˣ��������岻�ټ���
		// do nothing
	}

	@Override
	public void visitMainboard(Mainboard mainboard) {
		number++;
		totalPrice += mainboard.getPrice();
	}

	@Override
	public void visitPC(PC pc) {
		// �۸��������������������ˣ��������岻�ټ���
		// do nothing
	}

	/**
	 * �ܼ�
	 */
	public double getTotalPrice() {
		return totalPrice;
	}

	/**
	 * �ۿۼ۸�
	 */
	public double getDiscountPrice() {
		// 5��֮�ڴ�95�ۣ�20֮�ڴ�9�ۣ�����20��85��
		if (number < 5) {
			System.out.println("�������������" + number + "��95�ۡ�");
			return totalPrice * 0.95;
		} else if (number < 20) {
			System.out.println("�������������" + number + "��9�ۡ�");
			return totalPrice * 0.9;
		} else {
			System.out.println("�������������" + number + "��85�ۡ�");
			return totalPrice * 0.85;
		}
	}
}