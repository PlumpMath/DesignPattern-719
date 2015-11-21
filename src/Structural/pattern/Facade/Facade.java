/**
 * 
 */
package pattern.Facade;

/**
 * 门面(Facade)角色
 * <p>
 * 客户端可以调用这个角色的方法。此角色知晓相关的(一个或者多个)子系统的功能和责任。
 * 在正常情况下，本角色会将所有从客户端发来的请求委派到相应的子系统去。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-25
 */
public class Facade {
	
	// 在门面模式中，通常只需要门面类的一个实例(单例模式)
	private static Facade singleton = new Facade();

	// 门面类知道所有子系统的所有职责和功能
	private SubSystem1 subsystem1 = new SubSystem1();
	private SubSystem2 subsystem2 = new SubSystem2();
	private SubSystemN subsystemN = new SubSystemN();

	private Facade() {
		// do nothing
	}

	/**
	 * 单例
	 */
	public static Facade getInstance() {
		return singleton;
	}

	/**
	 * 对客户端提供的的高层接口
	 */
	public void operationAll() {
		// 委派给各个子系统进行相关操作
		subsystem1.operation1();
		subsystem2.operation2();
		subsystemN.operationN();
	}
}
