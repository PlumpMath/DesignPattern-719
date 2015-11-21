/**
 * 
 */
package pattern.Flyweight.demo2;

/**
 * 学校信息工厂
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-8-3
 */
public class SchoolInfoFactory {

	/**
	 * 每次都创建一个新的SchoolInfo对象
	 */
	public static SchoolInfo create(String name, int grade) {
		return new SchoolInfo(name, grade);
	}
}
