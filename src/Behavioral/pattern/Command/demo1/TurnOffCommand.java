/**
 * 
 */
package pattern.Command.demo1;

/**
 * �ر�����
 * <p>
 * ��������(ConcreteCommand)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-3
 */
public class TurnOffCommand implements Command {

	private Switchable sw;

	public TurnOffCommand(Switchable tv) {
		this.sw = tv;
	}

	/**
	 * ִ������
	 *
	 * @see pattern.Command.demo1.Command#execute()
	 */
	@Override
	public void execute() {
		sw.turnOff();
	}
}