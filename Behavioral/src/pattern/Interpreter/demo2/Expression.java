/**
 * 
 */
package pattern.Interpreter.demo2;

/**
 * 算术表达式接口
 * <p>
 * 这是对算术四则运算的抽象
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
	public double interpret();
}
