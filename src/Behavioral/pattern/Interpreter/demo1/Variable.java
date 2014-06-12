/**
 * 
 */
package pattern.Interpreter.demo1;

/**
 * boolean������
 * <p>
 * �ս�����ʽ(Terminal Expression)��ɫ
 * <p>
 * ÿ��������һ������������Ӧ��booleanֵ�����ڻ�������(Context)��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-7-20
 */
public class Variable extends Expression {

	private String name;// ������
	
	public Variable(String name) {
		this.name = name;
	}

	@Override
	public boolean interpret(Context context) {
		return context.lookup(this);
	}

	@Override
	public boolean equals(Object object) {
		if(object instanceof Variable){
			return ((Variable)object).name.equals(this.name);
		}
		return false;
	}

	@Override
	public String toString() {
		return name;
	}
}