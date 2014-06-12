/**
 * 
 */
package pattern.Visitor;

/**
 * ���������(ConcreteVisitor)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-17
 */
public class ConcreteVisitor2 implements Visitor {

	@Override
	public void visit(NodeA nodeA) {
		nodeA.operationA2();
	}

	@Override
	public void visit(NodeB nodeB) {
		nodeB.operationB2();
	}
}