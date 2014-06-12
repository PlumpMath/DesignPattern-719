/**
 * 
 */
package pattern.Visitor;

/**
 * 具体节点(ConcreteNode)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-17
 */
public class NodeB extends Node {

	/**
	 * 接受操作
	 */
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	/**
	 * 业务方法
	 */
	public void operationB1() {
		System.out.println("NodeB.operationB1()");
	}

	/**
	 * 业务方法
	 */
	public void operationB2() {
		System.out.println("NodeB.operationB2()");
	}
}