/**
 * 
 */
package pattern.Flyweight.demo2;

/**
 * 学校信息
 * <p>
 * 享元角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-8-3
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