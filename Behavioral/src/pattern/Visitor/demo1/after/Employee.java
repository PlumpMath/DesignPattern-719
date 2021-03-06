/**
 * 
 */
package pattern.Visitor.demo1.after;

/**
 * 普通雇员
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-19
 */
public class Employee extends AbstractEmployee {

	public Employee(String name, double salary) {
		super(name, salary);
	}

	@Override
	public void accept(IncomeVisitor visitor) {
		visitor.visit(this);
	}
}
