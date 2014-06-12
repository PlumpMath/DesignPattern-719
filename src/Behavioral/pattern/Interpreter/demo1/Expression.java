/**
 * 
 */
package pattern.Interpreter.demo1;

/**
 * �������ʽ�������
 * <p>
 * ������ʽ(Expression)��ɫ
 * <p>
 * ����һ�����еľ�����ʽ��ɫ����Ҫʵ�ֵĳ���ӿڡ�
 * �������������ս���ͷ��ս���ĳ��󻯡�
 * ����ӿ���Ҫ��һ��interpret()�������������Ͳ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-7-20
 */
public abstract class Expression {

	/**
	 * �Ի�����Ϊ���ݽ��ͱ��ʽ
	 * 
	 * @param context
	 *            ������
	 */
	public abstract boolean interpret(Context context);

	public abstract boolean equals(Object object);

	public abstract String toString();
}