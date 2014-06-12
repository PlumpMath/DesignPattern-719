/**
 * 
 */
package pattern.Visitor.demo1.after;

/**
 * ���³��۲���
 * <p>
 * ���³��ܹ���������Ա����ʵ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-19
 */
public class ChairmanVisitor implements IncomeVisitor {

	// ��˾н���ܶ�
	private double total = 0;

	@Override
	public void visit(CEO ceo) {
		double income = ceo.getSalary() + ceo.getCeoSpecialBonus()
				+ ceo.getDecemberBonus();
		this.total += income;
		System.out.println("CEO  " + ceo.getName() + "  ������  " + income);
	}

	@Override
	public void visit(GeneralManager gm) {
		double income = gm.getSalary() + gm.getAttendanceBonus()
				+ gm.getDecemberBonus();
		this.total += income;
		System.out.println("�ܾ���  " + gm.getName() + "  ������  " + income);
	}

	@Override
	public void visit(DeptManager dm) {
		double income = dm.getSalary() + dm.getAttendanceBonus();
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