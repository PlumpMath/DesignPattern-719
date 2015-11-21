/**
 * 
 */
package pattern.Visitor.demo1;

/**
 * 部门经理
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-19
 */
public class DeptManager extends AbstractEmployee {

	private double attendanceBonus;// 加班奖金

	public DeptManager(String name, double salary) {
		super(name, salary);
	}

	public double getAttendanceBonus() {
		return attendanceBonus;
	}

	public void setAttendanceBonus(double attendanceBonus) {
		this.attendanceBonus = attendanceBonus;
	}
}
