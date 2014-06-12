/**
 * 
 */
package pattern.Interpreter.demo2;

/**
 * ��ֵ���ʽ
 * <p>
 * �ս���ʽ��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-11
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