/**
 * 
 */
package pattern.Visitor.demo1;

/**
 * �����Ա
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-19
 */
public abstract class AbstractEmployee {

	private String name;// ����
	private double salary;// нˮ

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
}