/**
 * 
 */
package pattern.Interpreter.demo1;

/**
 * NOT���ʽ
 * <p>
 * ���ս�����ʽ(Nonterminal Expression)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-7-20
 */
public class Not extends Expression {

	private Expression exp;

	/**
	 * ���� NOT exp
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