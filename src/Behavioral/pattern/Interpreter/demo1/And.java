/**
 * 
 */
package pattern.Interpreter.demo1;

/**
 * AND���ʽ
 * <p>
 * ���ս�����ʽ(Nonterminal Expression)��ɫ
 * <p>
 * ����һ�������ɫ���ķ��е�ÿһ������R=R1R2R3����Rn����Ҫһ������ķ��ս�����ʽ�ࣻ
 * ��ÿһ��R1R2R3����Rn�еķ��Ŷ�����һ����̬����ΪExpression��ʵ��������ʵ�ֽ��Ͳ�������interpret()������
 * ���Ͳ����Եݹ鷽ʽ���������ᵽ�Ĵ���R1R2R3����Rn�еĸ������ŵ�ʵ��������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-7-20
 */
public class And extends Expression {

	private Expression leftExp;
	private Expression rightExp;

	/**
	 * ���� leftExp AND rightExp
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