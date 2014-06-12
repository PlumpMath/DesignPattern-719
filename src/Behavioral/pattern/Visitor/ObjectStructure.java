/**
 * 
 */
package pattern.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 结构对象(ObjectStructure)角色
 * <p>
 * 有如下的一些责任，可以遍历结构中的所有元素；
 * 如果需要，提供一个高层次的接口让访问者对象可以访问每一个元素；
 * 如果需要，可以设计成一个复合对象或者一个聚集，如List或者Set。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-17
 */
public class ObjectStructure {

	private List<Node> nodes;

	public ObjectStructure() {
		this.nodes = new ArrayList<Node>();
	}

	public void add(Node node) {
		nodes.add(node);
	}

	public void remove(Node node) {
		nodes.remove(node);
	}

	/**
	 * 执行访问操作
	 */
	public void visit(Visitor visitor) {
		/*
		 * 以NodeA为例，说明整个调用过程：
		 * 1，NodeA对象的接受方法被调用，并将Visitor对象本身传入
		 * 2，NodeA对象反过来调用Visitor对象的访问方法，并将NodeA对象本身传入
		 * 3，Visitor对象调用NodeA对象的业务与方法operation()
		 */
		for (Node node : nodes) {
			node.accept(visitor);
		}
		System.out.println();
	}
}