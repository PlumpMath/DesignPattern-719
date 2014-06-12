/**
 * 
 */
package pattern.Visitor;

/**
 * ���������(Visitor)��ɫ
 * <p>
 * ������һ�����߶�����ʲ������γ����еľ�������߽�ɫ����ʵ�ֵĽӿڡ�
 * <p>
 * �����г�������߽�ɫΪÿһ������ڵ㶼׼����һ�����ʲ�����
 * ������Ӧ�Ľڵ������Ϊ������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-17
 */
public interface Visitor {

	/**
	 * ����NodeA����
	 */
	public void visit(NodeA nodeA);

	/**
	 * ����NodeB����
	 */
	public void visit(NodeB nodeB);
}