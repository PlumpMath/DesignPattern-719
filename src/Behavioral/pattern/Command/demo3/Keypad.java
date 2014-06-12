/**
 * 
 */
package pattern.Command.demo3;

/**
 * ¼�����ϵļ���
 * <p>
 * ������(Invoker)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public class Keypad {

	private Command playCommand;// ��������
	
	private Command stopCommand;// ֹͣ����
	
	private Command rewindCommand;// ��������
	
	// ԭ��û�к�����Ĺ��ܣ��������й�����չʱ�����˴˹���
	// ��������ģʽ���ԣ�����Ҫ����һ�������MacroCommand����֮��
	// ֻ��Ҫ�ڱ���(Invoker)������һ���µķ������ɣ������޸�������
	private Command macroCommand;// ������

	/**
	 * @param playCommand
	 *            ��������
	 * @param stopCommand
	 *            ֹͣ����
	 * @param rewindCommand
	 *            ��������
	 */
	public Keypad(Command playCommand, Command stopCommand,
			Command rewindCommand) {
		this.playCommand = playCommand;
		this.stopCommand = stopCommand;
		this.rewindCommand = rewindCommand;
	}

	/**
	 * ���ú�����
	 * 
	 * @param macroCommand
	 *            ������
	 */
	public void setMacroCommand(Command macroCommand) {
		this.macroCommand = macroCommand;
	}

	/**
	 * ����
	 */
	public void play() {
		playCommand.execute();
	}

	/**
	 * ֹͣ
	 */
	public void stop() {
		stopCommand.execute();
	}

	/**
	 * ����
	 */
	public void rewind() {
		rewindCommand.execute();
	}

	/**
	 * ���ź�����
	 */
	public void macro() {
		macroCommand.execute();
	}
}