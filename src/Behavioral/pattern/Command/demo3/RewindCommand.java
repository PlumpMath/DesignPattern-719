/**
 * 
 */
package pattern.Command.demo3;

/**
 * Rewind��������
 * <p>
 * ��������(ConcreteCommand)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public class RewindCommand extends AbstractCommand {

	public RewindCommand(AudioPlayer player) {
		super(player);
	}

	@Override
	public void execute() {
		getPlayer().rewind();
	}
}