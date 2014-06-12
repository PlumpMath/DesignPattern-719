/**
 * 
 */
package pattern.Visitor;

/**
 * ���������(ConcreteVisitor)��ɫ
 * <p>
 * ʵ�ֳ�������߽�ɫ�������Ľӿڣ�Ҳ���Ǹ������ʲ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-17
 */
public class ConcreteVisitor1 implements Visitor {

	@Override
	public void visit(NodeA nodeA) {
		nodeA.operationA1();
	}

	@Override
	public void visit(NodeB nodeB) {
		nodeB.operationB1();
	}
}