/**
 * 
 */
package pattern.Interpreter.demo2;

/**
 * ˫�������ʽ����
 * <p>
 * ���ս���ʽ��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-11
 */
public abstract class TwoArgsExpression implements Expression {

	private Expression left;// �����ʽ
	private Expression right;// �Ҳ���ʽ

	public TwoArgsExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	/**
	 * ���������ö�ٶ���
	 */
	protected abstract Operator getOperator();

	protected Expression getLeft() {
		return left;
	}

	protected Expression getRight() {
		return right;
	}

	public String toString() {
		return getLeft().toString() + getOperator() + getRight().toString();
	}
}