/**
 * 
 */
package pattern.Command;

/**
 * 具体命令(ConcreteCommand)角色
 * <p>
 * 定义一个接收者和行为之间的弱耦合，实现抽象命令接口，负责调用接收者的相应操作。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-4
 */
public class ConcreteCommand implements Command {

	// 命令接收者
	private Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	public Receiver getReceiver() {
		return receiver;
	}

	@Override
	public void execute() {
		// 负责调用接收者的相应操作
		getReceiver().action();
	}
}