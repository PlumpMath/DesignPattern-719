/**
 * 
 */
package pattern.Command;

/**
 * ������(Invoker)��ɫ
 * <p>
 * ��������������ִ������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public class Invoker {

	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	/**
	 * ִ������
	 */
	public void executeCommand() {
		getCommand().execute();
	}
}