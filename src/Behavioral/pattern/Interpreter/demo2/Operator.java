/**
 * 
 */
package pattern.Interpreter.demo2;

/**
 * 算术运算符枚举
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-20
 */
public enum Operator {

	ADD('+'), SUB('-'), MUL('*'), DIV('/');

	private char code;

	private Operator(char code) {
		this.code = code;
	}

	public String toString() {
		return String.valueOf(code);
	}
}
