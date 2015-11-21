/**
 * 
 */
package pattern.Interpreter.demo2;

/**
 * 双参数表达式基类
 * <p>
 * 非终结表达式角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-11
 */
public abstract class TwoArgsExpression implements Expression {

	private Expression left;// 左侧表达式
	private Expression right;// 右侧表达式

	public TwoArgsExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	/**
	 * 返回运算符枚举对象
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
