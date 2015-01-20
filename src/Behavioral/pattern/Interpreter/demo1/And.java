/**
 * 
 */
package pattern.Interpreter.demo1;

/**
 * AND表达式
 * <p>
 * 非终结符表达式(Nonterminal Expression)角色
 * <p>
 * 这是一个具体角色。文法中的每一条规则R=R1R2R3……Rn都需要一个具体的非终结符表达式类；
 * 对每一个R1R2R3……Rn中的符号都持有一个静态类型为Expression的实例变量；实现解释操作，即interpret()方法。
 * 解释操作以递归方式调用上面提到的代表R1R2R3……Rn中的各个符号的实例变量。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-20
 */
public class And extends Expression {

	private Expression leftExp;
	private Expression rightExp;

	/**
	 * 代表 leftExp AND rightExp
	 */
	public And(Expression leftExp, Expression rightExp) {
		this.leftExp = leftExp;
		this.rightExp = rightExp;
	}

	@Override
	public boolean interpret(Context context) {
		return leftExp.interpret(context) && rightExp.interpret(context);
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof And) {
			And object2 = (And) object;
			return this.leftExp.equals(object2.leftExp)
					&& this.rightExp.equals(object2.rightExp);
		}
		return false;
	}

	@Override
	public String toString() {
		return "(" + leftExp.toString() + " AND " + rightExp.toString() + ")";
	}
}