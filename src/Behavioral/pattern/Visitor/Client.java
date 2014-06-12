/**
 * 
 */
package pattern.Visitor;

/**
 * 客户端
 * <p>
 * 这个示意性的实现里面并没有出现一个复杂的具有多个树枝节点的对象树结构
 * 但是在实际系统中访问者模式通常是用来处理复杂的对象树结构的
 * 而且访问者模式可以用来处理跨越多个等级结构的树结构问题。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-17
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObjectStructure structure = new ObjectStructure();
		structure.add(new NodeA());
		structure.add(new NodeB());
		structure.visit(new ConcreteVisitor1());
		structure.visit(new ConcreteVisitor2());
	}
}