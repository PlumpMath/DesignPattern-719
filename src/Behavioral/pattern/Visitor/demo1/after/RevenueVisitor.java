/**
 * 
 */
package pattern.Visitor.demo1.after;

/**
 * 税务局观察者
 * <p>
 * 税务局只能够看到所有员工的报税收入
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-19
 */
public class RevenueVisitor implements IncomeVisitor {

	// 公司薪金总额
	private double total = 0;

	@Override
	public void visit(CEO ceo) {
		double income = ceo.getSalary() + ceo.getDecemberBonus();// 为了避税，不计算CEO特别奖金
		this.total += income;
		System.out.println("CEO  " + ceo.getName() + "  总收入  " + income);
	}

	@Override
	public void visit(GeneralManager gm) {
		double income = gm.getSalary() + gm.getAttendanceBonus()
				+ gm.getDecemberBonus() * 0.5;// 为了避税，年终奖只计算50%
		this.total += income;
		System.out.println("总经理  " + gm.getName() + "  总收入  " + income);
	}

	@Override
	public void visit(DeptManager dm) {
		double income = dm.getSalary() + dm.getAttendanceBonus() * 0.8;// 为了避税，年终奖只计算80%
		this.total += income;
		System.out.println("部门经理  " + dm.getName() + "  总收入  " + income);
	}

	@Override
	public void visit(Employee em) {
		double income = em.getSalary();
		this.total += income;
		System.out.println("普通员工  " + em.getName() + "  总收入  " + income);
	}

	public double getTotal() {
		return total;
	}
}