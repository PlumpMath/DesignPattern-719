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
public class SubOperator extends AbstractOperator {

	private static final String SUB = "-";
	
	public SubOperator(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public double getResult() {
		return getLeft().getResult() - getRight().getResult();
	}

	@Override
	protected String getOperator() {
		return SUB;
	}
}