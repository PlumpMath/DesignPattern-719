/**
 * 
 */
package pattern.Interpreter.demo2;

/**
 * 数值表达式
 * <p>
 * 终结表达式角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-11
 */
public class Number implements Expression {

	private double value;

	public Number(double value) {
		this.value = value;
	}

	public String toString() {
		return String.valueOf(value);
	}

	@Override
	public double interpret() {
		return value;
	}
}
