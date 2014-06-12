/**
 * 
 */
package pattern.Visitor.demo2;

/**
 * VIP�۸������
 * <p>
 * ����ΪVIP�û����㶩���۸�(����Ӧ�ۿ�)
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-20
 */
public class VipPriceVisitor implements Visitor {

	// �ܼ�
	private double vipTotalPrice = 0;

	@Override
	public void visitCPU(CPU cpu) {
		double p = cpu.getPrice() * 0.9;// CPU��9��
		System.out.println("CPU VIP�Żݼۣ�" + p);
		vipTotalPrice += p;
	}

	@Override
	public void visitCase(Case e) {
		double p = e.getPrice() * 0.9;// �����9��
		System.out.println("Case VIP�Żݼۣ�" + p);
		vipTotalPrice += p;
	}

	@Override
	public void visitHardDisk(HardDisk hardDisk) {
		double p = hardDisk.getPrice() * 0.85;// Ӳ�̴�85��
		System.out.println("HardDisk VIP�Żݼۣ�" + p);
		vipTotalPrice += p;
	}

	@Override
	public void visitIntegratedBoard(IntegratedBoard integratedboard) {
		// �ۿ۶�������������ˣ��������岻���������
		// do nothing
	}

	@Override
	public void visitMainboard(Mainboard mainboard) {
		double p = mainboard.getPrice() * 0.8;// �����8��
		System.out.println("Mainboard VIP�Żݼۣ�" + p);
		vipTotalPrice += p;
	}

	@Override
	public void visitPC(PC pc) {
		// �ۿ۶�������������ˣ��������岻���������
		// do nothing
	}

	/**
	 * �ܼ�
	 */
	public double getVipTotalPrice() {
		return vipTotalPrice;
	}
}