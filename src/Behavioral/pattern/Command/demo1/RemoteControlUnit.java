/**
 * 
 */
package pattern.Command.demo1;

/**
 * ң����
 * <p>
 * ������(Invoker)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-3
 */
public class RemoteControlUnit {

	private Command command;// ���еĵ�ǰ����

	private Command getCommand() {
		return command;
	}

	/**
	 * ���õ�ǰ����
	 */
	public void setCommand(Command command) {
		this.command = command;
	}

	/**
	 * ����ִ������
	 */
	public void executeCommand() {
		getCommand().execute();
	}
}