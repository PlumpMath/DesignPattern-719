/**
 * 
 */
package pattern.Visitor;

/**
 * ����ڵ�(ConcreteNode)��ɫ
 * <p>
 * ʵ���˳���ڵ��ɫ���涨�Ľ��ܲ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-17
 */
public class NodeA extends Node {

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
	public void operationA1() {
		System.out.println("NodeA.operationA1()");
	}

	/**
	 * ҵ�񷽷�
	 */
	public void operationA2() {
		System.out.println("NodeA.operationA2()");
	}
}