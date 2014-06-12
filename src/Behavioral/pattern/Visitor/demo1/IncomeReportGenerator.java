/**
 * 
 */
package pattern.Visitor.demo1;

import java.util.List;

/**
 * 收入报表生成器
 * <p>
 * 用于根据公司生成各种报表，如内部报表、税务报表等
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-19
 */
public class IncomeReportGenerator {

	private List<AbstractEmployee> employees;

	public IncomeReportGenerator(Company company) {
		this.employees = company.getEmployees();
	}

	/**
	 * 生成董事长看到的雇员薪资报表
	 */
	public void generate4Chairman() {
		System.out.println("*******董事长看到的雇员薪资报表*******");
		double total = 0;// 总收入
		double income = 0;
		for (AbstractEmployee emploee : employees) {
			// 对于不同员工要使用instanceof进行判断，然后计算其真实收入
			if (emploee instanceof CEO) {
				CEO ceo = (CEO) emploee;
				income = ceo.getSalary() + ceo.getCeoSpecialBonus()
						+ ceo.getDecemberBonus();
				System.out.println("CEO  " + ceo.getName() + "  总收入  " + income);
			} else if (emploee instanceof GeneralManager) {
				GeneralManager gm = (GeneralManager) emploee;
				income = gm.getSalary() + gm.getAttendanceBonus()
						+ gm.getDecemberBonus();
				System.out.println("总经理  " + gm.getName() + "  总收入  " + income);
			} else if (emploee instanceof DeptManager) {
				DeptManager dm = (DeptManager) emploee;
				income = dm.getSalary() + dm.getAttendanceBonus();
				System.out
						.println("部门经理  " + dm.getName() + "  总收入  " + income);
			} else if (emploee instanceof Employee) {
				Employee em = (Employee) emploee;
				income = em.getSalary();
				System.out.println("普通员工  " + em.getName() + "  总收入  " + income);
			}
			total += income;
		}
		System.out.println("薪资总额  " + total);
		System.out.println();
	}

	/**
	 * 生成税务局看到的雇员薪资报表
	 */
	public void generate4Revenue() {
		System.out.println("*******税务局看到的雇员薪资报表*******");
		double total = 0;// 总收入
		double income = 0;
		for (AbstractEmployee emploee : employees) {
			// 对于不同员工要使用instanceof进行判断，然后计算其税务收入
			if (emploee instanceof CEO) {
				CEO ceo = (CEO) emploee;
				income = ceo.getSalary() + ceo.getDecemberBonus();// 为了避税，不计算CEO特别奖金
				System.out.println("CEO  " + ceo.getName() + "  总收入  " + income);
			} else if (emploee instanceof GeneralManager) {
				GeneralManager gm = (GeneralManager) emploee;
				income = gm.getSalary() + gm.getAttendanceBonus()
						+ gm.getDecemberBonus() * 0.5;// 为了避税，年终奖只计算50%
				System.out.println("总经理  " + gm.getName() + "  总收入  " + income);
			} else if (emploee instanceof DeptManager) {
				DeptManager dm = (DeptManager) emploee;
				income = dm.getSalary() + dm.getAttendanceBonus() * 0.8;// 为了避税，年终奖只计算80%
				System.out.println("部门经理  " + dm.getName() + "  总收入  " + income);
			} else if (emploee instanceof Employee) {
				Employee em = (Employee) emploee;
				income = em.getSalary();
				System.out.println("普通员工  " + em.getName() + "  总收入  " + income);
			}
			total += income;
		}
		System.out.println("薪资总额  " + total);
		System.out.println();
	}
}