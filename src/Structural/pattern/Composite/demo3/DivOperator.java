/**
 * 
 */
package pattern.Composite.demo3;

/**
 * 除 运算符
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-11
 */
public class DivOperator extends AbstractOperator {

	private static final String DIV = "/";

	public DivOperator(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public double getResult() {
		return getLeft().getResult() / getRight().getResult();
	}
	
	@Override
	protected String getOperator() {
		return DIV;
	}
}
