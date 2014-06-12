/**
 * 
 */
package pattern.Interpreter.demo1;

/**
 * ����������
 * <p>
 * �ս�����ʽ(Terminal Expression)��ɫ
 * <p>
 * ����һ�������ɫ��ʵ���˳�����ʽ��ɫ��Ҫ��Ľӿڣ���Ҫ��һ��interpret()������
 * �ķ��е�ÿһ���ս������һ�������ս���ʽ��֮���Ӧ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-7-20
 */
public class Constant extends Expression {

	private boolean value;

	/**
	 * ʹ�ò���ֵ����boolean��������
	 */
	public Constant(boolean value) {
		this.value = value;
	}

	@Override
	public boolean interpret(Context context) {
		return value;
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof Constant) {
			return ((Constant) object).value == this.value;
		}
		return false;
	}

	@Override
	public String toString() {
		return new Boolean(value).toString();
	}
}