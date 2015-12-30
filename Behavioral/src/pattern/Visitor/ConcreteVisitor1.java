/**
 * 
 */
package pattern.Visitor;

/**
 * 具体访问者(ConcreteVisitor)角色
 * <p>
 * 实现抽象访问者角色所声明的接口，也就是各个访问操作。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-17
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
