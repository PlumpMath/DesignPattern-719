/**
 * 
 */
package pattern.Visitor.demo1;

/**
 * �ܾ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-19
 */
public class GeneralManager extends AbstractEmployee {

	private double decemberBonus;// ���ս�
	private double attendanceBonus;// �Ӱཱ��

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