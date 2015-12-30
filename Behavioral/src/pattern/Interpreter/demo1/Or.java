/**
 * 
 */
package pattern.Interpreter.demo1;

/**
 * OR表达式
 * <p>
 * 非终结符表达式(Nonterminal Expression)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-20
 */
public class Or extends Expression {

	private Expression leftExp;
	private Expression rightExp;

	/**
	 * 代表 leftExp OR rightExp
	 */
	public Or(Expression leftExp, Expression rightExp) {
		this.leftExp = leftExp;
		this.rightExp = rightExp;
	}

	@Override
	public boolean interpret(Context context) {
		return leftExp.interpret(context) || rightExp.interpret(context);
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof Or) {
			Or object2 = (Or) object;
			return this.leftExp.equals(object2.leftExp)
					&& this.rightExp.equals(object2.rightExp);
		}
		return false;
	}

	@Override
	public String toString() {
		return "(" + leftExp.toString() + " OR " + rightExp.toString() + ")";
	}
}
