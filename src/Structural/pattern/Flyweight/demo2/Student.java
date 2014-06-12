/**
 * 
 */
package pattern.Flyweight.demo2;

/**
 * ѧ����Ϣ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-8-3
 */
public class Student {

	private String name;
	private SchoolInfo school;// ѧУ��Ϣ

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getSchool() {
		return school.getSchool();
	}

	public int getGrade() {
		return school.getGrade();
	}

	public void setSchool(SchoolInfo school) {
		this.school = school;
	}

	public String toString() {
		return "Name=" + name + ",School=" + getSchool() + ",Grade="
				+ getGrade();
	}
}