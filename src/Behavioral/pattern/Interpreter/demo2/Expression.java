/**
 * 
 */
package pattern.Interpreter.demo2;

/**
 * �������ʽ�ӿ�
 * <p>
 * ���Ƕ�������������ĳ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-11
 */
public interface Expression {

	/**
	 * String��ʽ
	 */
	public String toString();

	/**
	 * ���ر��ʽ������
	 */
	public double interpret();
}