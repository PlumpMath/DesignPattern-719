/**
 * 
 */
package pattern.Composite.demo3;

/**
 * �� �����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-11
 */
public class MulOperator extends AbstractOperator {

	private static final String MUL = "*";

	public MulOperator(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public double getResult() {
		return getLeft().getResult() * getRight().getResult();
	}

	@Override
	protected String getOperator() {
		return MUL;
	}
}