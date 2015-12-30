/**
 * 
 */
package pattern.Visitor;

/**
 * 抽象节点(Node)角色
 * <p>
 * 声明一个接受操作，接受一个访问者对象作为一个参量。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-17
 */
public abstract class Node {

	/**
	 * 接受操作
	 */
	public abstract void accept(Visitor visitor);
}
