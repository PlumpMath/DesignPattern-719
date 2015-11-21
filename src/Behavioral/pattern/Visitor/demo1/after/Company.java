/**
 * 
 */
package pattern.Visitor.demo1.after;

import java.util.ArrayList;
import java.util.List;

/**
 * 公司
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-19
 */
public class Company {

	private List<AbstractEmployee> employees;
	
	public Company(){
		super();
		addEmployees();
	}

	private void addEmployees() {
		CEO ceo = new CEO("Tom",1000000);
		ceo.setCeoSpecialBonus(300000);
		ceo.setDecemberBonus(200000);
		getEmployees().add(ceo);
		
		GeneralManager gm = new GeneralManager("Jimmy",400000);
		gm.setAttendanceBonus(50000);
		gm.setDecemberBonus(100000);
		getEmployees().add(gm);
		
		DeptManager dm = new DeptManager("Shakira",200000);
		dm.setAttendanceBonus(30000);
		getEmployees().add(dm);
		
		DeptManager dm2 = new DeptManager("Rebecca",240000);
		dm2.setAttendanceBonus(35000);
		getEmployees().add(dm2);
		
		getEmployees().add(new Employee("Jack",100000));
		getEmployees().add(new Employee("Lily",90000));
		getEmployees().add(new Employee("Tim",80000));
	}

	/**
	 * 返回所有员工列表
	 */
	public List<AbstractEmployee> getEmployees() {
		if(employees == null){
			employees = new ArrayList<AbstractEmployee>();
		}
		return employees;
	}
}
