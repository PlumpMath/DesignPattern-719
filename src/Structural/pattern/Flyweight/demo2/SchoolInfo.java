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
	
	// ģ��ռ���ڴ�������
	private byte[] data = new byte[1000];

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

	public byte[] getData() {
		return data;
	}
}