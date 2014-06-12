/**
 * 
 */
package pattern.Facade;

/**
 * 子系统1
 * <p>
 * 子系统(Subsystem)角色
 * <p>
 * 可以同时有一个或者多个子系统。每一个子系统都不是一个单独的类，而是一组类的集合。
 * 每一个子系统都可以被客户端直接调用，或者被门面角色调用。
 * 子系统并不知道门面的存在，对于子系统而言，门面仅仅是另外一个客户端而已。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-25
 */
public class SubSystem1 {

	public void operation1() {
		System.out.println("This is SubSystem1.");
	}
}