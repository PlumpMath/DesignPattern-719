/**
 * 
 */
package pattern.Visitor.demo1;

/**
 * ���ž���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-19
 */
public class DeptManager extends AbstractEmployee {

	private double attendanceBonus;// �Ӱཱ��

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