/**
 * 
 */
package pattern.Composite.demo3;

/**
 * �����������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-11
 */
public abstract class AbstractOperator implements Expression {

	private Expression left;// �����ʽ
	private Expression right;// �Ҳ���ʽ

	public AbstractOperator(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	/**
	 * ���������String��ʾ
	 */
	protected abstract String getOperator();

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