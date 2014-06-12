/**
 * 
 */
package pattern.Command.demo3;

/**
 * Play��������
 * <p>
 * ��������(ConcreteCommand)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public class PlayCommand extends AbstractCommand {

	public PlayCommand(AudioPlayer player) {
		super(player);
	}

	@Override
	public void execute() {
		getPlayer().playMusic();
	}
}