/**
 * 
 */
package pattern.Composite.demo3;

/**
 * 算术表达式接口
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-11
 */
public interface Expression {

	/**
	 * String形式
	 */
	public String toString();
	
	/**
	 * 返回表达式运算结果
	 */
	public double getResult();
}