/**
 * 
 */
package pattern.Visitor.demo1.after;

/**
 * ˰��ֹ۲���
 * <p>
 * ˰���ֻ�ܹ���������Ա���ı�˰����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-19
 */
public class RevenueVisitor implements IncomeVisitor {

	// ��˾н���ܶ�
	private double total = 0;

	@Override
	public void visit(CEO ceo) {
		double income = ceo.getSalary() + ceo.getDecemberBonus();// Ϊ�˱�˰��������CEO�ر𽱽�
		this.total += income;
		System.out.println("CEO  " + ceo.getName() + "  ������  " + income);
	}

	@Override
	public void visit(GeneralManager gm) {
		double income = gm.getSalary() + gm.getAttendanceBonus()
				+ gm.getDecemberBonus() * 0.5;// Ϊ�˱�˰�����ս�ֻ����50%
		this.total += income;
		System.out.println("�ܾ���  " + gm.getName() + "  ������  " + income);
	}

	@Override
	public void visit(DeptManager dm) {
		double income = dm.getSalary() + dm.getAttendanceBonus() * 0.8;// Ϊ�˱�˰�����ս�ֻ����80%
		this.total += income;
		System.out.println("���ž���  " + dm.getName() + "  ������  " + income);
	}

	@Override
	public void visit(Employee em) {
		double income = em.getSalary();
		this.total += income;
		System.out.println("��ͨԱ��  " + em.getName() + "  ������  " + income);
	}

	public double getTotal() {
		return total;
	}
}