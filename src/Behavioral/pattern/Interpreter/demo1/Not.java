/**
 * 
 */
package pattern.Interpreter.demo1;

/**
 * NOT表达式
 * <p>
 * 非终结符表达式(Nonterminal Expression)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-20
 */
public class Not extends Expression {

	private Expression exp;

	/**
	 * 代表 NOT exp
	 */
	public Not(Expression exp) {
		this.exp = exp;
	}

	@Override
	public boolean interpret(Context context) {
		return !exp.interpret(context);
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof Not) {
			return this.exp.equals(((Not) object).exp);
		}
		return false;
	}

	@Override
	public String toString() {
		return "(NOT " + exp.toString() + ")";
	}
}