/**
 * 
 */
package pattern.Flyweight.demo2;

/**
 * ѧУ��Ϣ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-8-3
 */
public class SchoolInfoFactory {

	/**
	 * ÿ�ζ�����һ���µ�SchoolInfo����
	 */
	public static SchoolInfo create(String name, int grade) {
		return new SchoolInfo(name, grade);
	}
}