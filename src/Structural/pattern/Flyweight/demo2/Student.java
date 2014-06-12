/**
 * 
 */
package pattern.Flyweight.demo2;

/**
 * 学生信息
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-8-3
 */
public class Student {

	private String name;
	private SchoolInfo school;// 学校信息

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