/**
 * 
 */
package pattern.Interpreter.demo2;

/**
 * �������ʽ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-11
 */
public class DivExpression extends TwoArgsExpression {

	public DivExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public double interpret() {
		return getLeft().interpret() / getRight().interpret();
	}
	
	@Override
	protected Operator getOperator() {
		return Operator.DIV;
	}
}