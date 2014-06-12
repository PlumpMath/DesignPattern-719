/**
 * 
 */
package pattern.Interpreter.demo2;

/**
 * �ӷ����ʽ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-11
 */
public class AddExpression extends TwoArgsExpression {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public double interpret() {
		return getLeft().interpret() + getRight().interpret();
	}

	@Override
	protected Operator getOperator() {
		return Operator.ADD;
	}
}