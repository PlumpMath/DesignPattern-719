/**
 * 
 */
package pattern.Visitor.demo1.after;

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
		// ʹ���˷�����ģʽ�Ͳ��ý��������ж���
		IncomeVisitor visitor = new ChairmanVisitor();
		for (AbstractEmployee emploee : employees) {
			emploee.accept(visitor);
		}
		System.out.println("н���ܶ�  " + visitor.getTotal());
		System.out.println();
	}

	/**
	 * ����˰��ֿ����Ĺ�Աн�ʱ���
	 */
	public void generate4Revenue() {
		System.out.println("*******˰��ֿ����Ĺ�Աн�ʱ���*******");
		// ʹ���˷�����ģʽ�Ͳ��ý��������ж���
		IncomeVisitor visitor = new RevenueVisitor();
		for (AbstractEmployee emploee : employees) {
			emploee.accept(visitor);
		}
		System.out.println("н���ܶ�  " + visitor.getTotal());
		System.out.println();
	}
}