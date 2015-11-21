/**
 * 
 */
package pattern.Command;

/**
 * 客户(Client)角色
 * <p>
 * 创建具体命令(ConcreteCommand)对象并确定其接收者。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-4
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker(command);
		invoker.executeCommand();
	}
}
