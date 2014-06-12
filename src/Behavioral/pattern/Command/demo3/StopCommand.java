/**
 * 
 */
package pattern.Command.demo3;

/**
 * Stopֹͣ����
 * <p>
 * ��������(ConcreteCommand)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public class StopCommand extends AbstractCommand {

	public StopCommand(AudioPlayer player) {
		super(player);
	}

	@Override
	public void execute() {
		getPlayer().stopPlaying();
	}
}