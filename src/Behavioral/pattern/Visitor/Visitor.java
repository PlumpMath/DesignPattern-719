/**
 * 
 */
package pattern.Visitor;

/**
 * 抽象访问者(Visitor)角色
 * <p>
 * 声明了一个或者多个访问操作，形成所有的具体访问者角色必须实现的接口。
 * <p>
 * 本例中抽象访问者角色为每一个具体节点都准备了一个访问操作，
 * 接收相应的节点对象作为参量。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-17
 */
public interface Visitor {

	/**
	 * 访问NodeA对象
	 */
	public void visit(NodeA nodeA);

	/**
	 * 访问NodeB对象
	 */
	public void visit(NodeB nodeB);
}