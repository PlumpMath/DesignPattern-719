/**
 * 
 */
package pattern.Visitor.demo1.after;

/**
 * 抽象雇员
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-19
 */
public abstract class AbstractEmployee {

	private String name;// 姓名
	private double salary;// 薪水

	public AbstractEmployee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * 接受方法
	 * 
	 * @param visitor
	 *            访问者
	 */
	public abstract void accept(IncomeVisitor visitor);
}
