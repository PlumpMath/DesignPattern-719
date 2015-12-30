/**
 * 
 */
package pattern.Visitor.demo1.after;

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
		// 使用了访问者模式就不用进行类型判断了
		IncomeVisitor visitor = new ChairmanVisitor();
		for (AbstractEmployee emploee : employees) {
			emploee.accept(visitor);
		}
		System.out.println("薪资总额  " + visitor.getTotal());
		System.out.println();
	}

	/**
	 * 生成税务局看到的雇员薪资报表
	 */
	public void generate4Revenue() {
		System.out.println("*******税务局看到的雇员薪资报表*******");
		// 使用了访问者模式就不用进行类型判断了
		IncomeVisitor visitor = new RevenueVisitor();
		for (AbstractEmployee emploee : employees) {
			emploee.accept(visitor);
		}
		System.out.println("薪资总额  " + visitor.getTotal());
		System.out.println();
	}
}
