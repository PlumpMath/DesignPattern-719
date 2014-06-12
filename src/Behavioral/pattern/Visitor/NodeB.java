/**
 * 
 */
package pattern.Visitor;

/**
 * ����ڵ�(ConcreteNode)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-17
 */
public class NodeB extends Node {

	/**
	 * ���ܲ���
	 */
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	/**
	 * ҵ�񷽷�
	 */
	public void operationB1() {
		System.out.println("NodeB.operationB1()");
	}

	/**
	 * ҵ�񷽷�
	 */
	public void operationB2() {
		System.out.println("NodeB.operationB2()");
	}
}