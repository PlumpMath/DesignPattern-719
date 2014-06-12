/**
 * 
 */
package pattern.Command.demo1;

/**
 * ������
 * <p>
 * ��������(ConcreteCommand)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-3
 */
public class TurnOnCommand implements Command {

	private Switchable sw;

	public TurnOnCommand(Switchable tv) {
		this.sw = tv;
	}

	/**
	 * ִ������
	 * 
	 * @see pattern.Command.demo1.Command#execute()
	 */
	@Override
	public void execute() {
		sw.turnOn();
	}
}