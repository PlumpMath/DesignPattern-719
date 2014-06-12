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
public class AddOperator extends AbstractOperator {

	private static final String ADD = "+";
	
	public AddOperator(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public double getResult() {
		return getLeft().getResult() + getRight().getResult();
	}

	@Override
	protected String getOperator() {
		return ADD;
	}
}