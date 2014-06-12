/**
 * 
 */
package pattern.Composite.demo3;

/**
 * ��ֵ��
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

	@Override
	public double getResult() {
		return value;
	}

	public String toString() {
		return String.valueOf(value);
	}
}