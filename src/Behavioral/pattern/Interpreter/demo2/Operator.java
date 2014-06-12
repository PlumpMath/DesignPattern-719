/**
 * 
 */
package pattern.Interpreter.demo2;

/**
 * ���������ö��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-7-20
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