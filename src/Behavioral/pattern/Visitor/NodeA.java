/**
 * 
 */
package pattern.Visitor;

/**
 * 具体节点(ConcreteNode)角色
 * <p>
 * 实现了抽象节点角色所规定的接受操作。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-17
 */
public class NodeA extends Node {

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
	public void operationA1() {
		System.out.println("NodeA.operationA1()");
	}

	/**
	 * 业务方法
	 */
	public void operationA2() {
		System.out.println("NodeA.operationA2()");
	}
}
