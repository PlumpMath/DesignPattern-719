/**
 * 
 */
package pattern.Visitor.demo1;

import java.util.List;

/**
 * ���뱨��������
 * <p>
 * ���ڸ��ݹ�˾���ɸ��ֱ������ڲ�����˰�񱨱��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-19
 */
public class IncomeReportGenerator {

	private List<AbstractEmployee> employees;

	public IncomeReportGenerator(Company company) {
		this.employees = company.getEmployees();
	}

	/**
	 * ���ɶ��³������Ĺ�Աн�ʱ���
	 */
	public void generate4Chairman() {
		System.out.println("*******���³������Ĺ�Աн�ʱ���*******");
		double total = 0;// ������
		double income = 0;
		for (AbstractEmployee emploee : employees) {
			// ���ڲ�ͬԱ��Ҫʹ��instanceof�����жϣ�Ȼ���������ʵ����
			if (emploee instanceof CEO) {
				CEO ceo = (CEO) emploee;
				income = ceo.getSalary() + ceo.getCeoSpecialBonus()
						+ ceo.getDecemberBonus();
				System.out.println("CEO  " + ceo.getName() + "  ������  " + income);
			} else if (emploee instanceof GeneralManager) {
				GeneralManager gm = (GeneralManager) emploee;
				income = gm.getSalary() + gm.getAttendanceBonus()
						+ gm.getDecemberBonus();
				System.out.println("�ܾ���  " + gm.getName() + "  ������  " + income);
			} else if (emploee instanceof DeptManager) {
				DeptManager dm = (DeptManager) emploee;
				income = dm.getSalary() + dm.getAttendanceBonus();
				System.out
						.println("���ž���  " + dm.getName() + "  ������  " + income);
			} else if (emploee instanceof Employee) {
				Employee em = (Employee) emploee;
				income = em.getSalary();
				System.out.println("��ͨԱ��  " + em.getName() + "  ������  " + income);
			}
			total += income;
		}
		System.out.println("н���ܶ�  " + total);
		System.out.println();
	}

	/**
	 * ����˰��ֿ����Ĺ�Աн�ʱ���
	 */
	public void generate4Revenue() {
		System.out.println("*******˰��ֿ����Ĺ�Աн�ʱ���*******");
		double total = 0;// ������
		double income = 0;
		for (AbstractEmployee emploee : employees) {
			// ���ڲ�ͬԱ��Ҫʹ��instanceof�����жϣ�Ȼ�������˰������
			if (emploee instanceof CEO) {
				CEO ceo = (CEO) emploee;
				income = ceo.getSalary() + ceo.getDecemberBonus();// Ϊ�˱�˰��������CEO�ر𽱽�
				System.out.println("CEO  " + ceo.getName() + "  ������  " + income);
			} else if (emploee instanceof GeneralManager) {
				GeneralManager gm = (GeneralManager) emploee;
				income = gm.getSalary() + gm.getAttendanceBonus()
						+ gm.getDecemberBonus() * 0.5;// Ϊ�˱�˰�����ս�ֻ����50%
				System.out.println("�ܾ���  " + gm.getName() + "  ������  " + income);
			} else if (emploee instanceof DeptManager) {
				DeptManager dm = (DeptManager) emploee;
				income = dm.getSalary() + dm.getAttendanceBonus() * 0.8;// Ϊ�˱�˰�����ս�ֻ����80%
				System.out.println("���ž���  " + dm.getName() + "  ������  " + income);
			} else if (emploee instanceof Employee) {
				Employee em = (Employee) emploee;
				income = em.getSalary();
				System.out.println("��ͨԱ��  " + em.getName() + "  ������  " + income);
			}
			total += income;
		}
		System.out.println("н���ܶ�  " + total);
		System.out.println();
	}
}