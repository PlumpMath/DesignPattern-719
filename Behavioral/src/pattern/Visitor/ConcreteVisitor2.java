/**
 * 
 */
package pattern.Visitor;

/**
 * 具体访问者(ConcreteVisitor)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-17
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
