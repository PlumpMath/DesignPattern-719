/**
 * 
 */
package pattern.Visitor;

/**
 * ����ڵ�(Node)��ɫ
 * <p>
 * ����һ�����ܲ���������һ�������߶�����Ϊһ��������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-17
 */
public abstract class Node {

	/**
	 * ���ܲ���
	 */
	public abstract void accept(Visitor visitor);
}