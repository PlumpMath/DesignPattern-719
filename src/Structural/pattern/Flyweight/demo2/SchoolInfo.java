/**
 * 
 */
package pattern.Flyweight.demo2;

/**
 * ѧУ��Ϣ
 * <p>
 * ��Ԫ��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-8-3
 */
public class SchoolInfo {

	private String school;
	private int grade;

	SchoolInfo(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}

	public String getSchool() {
		return school;
	}

	public int getGrade() {
		return grade;
	}
}