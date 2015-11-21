/**
 * 
 */
package pattern.Visitor.demo1.after;

/**
 * 收入访问者接口
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-19
 */
public interface IncomeVisitor {

	/**
	 * 访问CEO
	 */
	public void visit(CEO ceo);

	/**
	 * 访问总经理
	 */
	public void visit(GeneralManager gm);

	/**
	 * 访问部门经理
	 */
	public void visit(DeptManager dm);

	/**
	 * 访问普通雇员
	 */
	public void visit(Employee em);

	/**
	 * 返回总额
	 */
	public double getTotal();
}
