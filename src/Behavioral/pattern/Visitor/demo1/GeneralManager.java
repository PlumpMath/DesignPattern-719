/**
 * 
 */
package pattern.Visitor.demo1;

/**
 * 总经理
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-19
 */
public class GeneralManager extends AbstractEmployee {

	private double decemberBonus;// 年终奖
	private double attendanceBonus;// 加班奖金

	public GeneralManager(String name, double salary) {
		super(name, salary);
	}

	public double getDecemberBonus() {
		return decemberBonus;
	}

	public void setDecemberBonus(double decemberBonus) {
		this.decemberBonus = decemberBonus;
	}

	public double getAttendanceBonus() {
		return attendanceBonus;
	}

	public void setAttendanceBonus(double attendanceBonus) {
		this.attendanceBonus = attendanceBonus;
	}
}