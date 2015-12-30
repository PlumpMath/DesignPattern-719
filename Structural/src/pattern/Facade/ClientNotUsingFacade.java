/**
 * 
 */
package pattern.Facade;

/**
 * 没有使用门面模式时的客户端
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-25
 */
public class ClientNotUsingFacade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 完成一个功能需要和多个子系统对象打交道
		SubSystem1 subsystem1 = new SubSystem1();
		subsystem1.operation1();
		SubSystem2 subsystem2 = new SubSystem2();
		subsystem2.operation2();
		SubSystemN subsystemN = new SubSystemN();
		subsystemN.operationN();
	}
}
