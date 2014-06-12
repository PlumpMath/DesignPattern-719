/**
 * 
 */
package pattern.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * �ṹ����(ObjectStructure)��ɫ
 * <p>
 * �����µ�һЩ���Σ����Ա����ṹ�е�����Ԫ�أ�
 * �����Ҫ���ṩһ���߲�εĽӿ��÷����߶�����Է���ÿһ��Ԫ�أ�
 * �����Ҫ��������Ƴ�һ�����϶������һ���ۼ�����List����Set��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-17
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
	 * ִ�з��ʲ���
	 */
	public void visit(Visitor visitor) {
		/*
		 * ��NodeAΪ����˵���������ù��̣�
		 * 1��NodeA����Ľ��ܷ��������ã�����Visitor��������
		 * 2��NodeA���󷴹�������Visitor����ķ��ʷ���������NodeA��������
		 * 3��Visitor�������NodeA�����ҵ���뷽��operation()
		 */
		for (Node node : nodes) {
			node.accept(visitor);
		}
		System.out.println();
	}
}