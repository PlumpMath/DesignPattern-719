/**
 * 
 */
package pattern.Command;

/**
 * ��������(ConcreteCommand)��ɫ
 * <p>
 * ����һ�������ߺ���Ϊ֮�������ϣ�ʵ�ֳ�������ӿڣ�������ý����ߵ���Ӧ������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public class ConcreteCommand implements Command {

	// ���������
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
		// ������ý����ߵ���Ӧ����
		getReceiver().action();
	}
}