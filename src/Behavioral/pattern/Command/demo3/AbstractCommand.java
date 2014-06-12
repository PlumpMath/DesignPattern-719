/**
 * 
 */
package pattern.Command.demo3;

/**
 * �����������
 * <p>
 * ��Ϊ¼��������Ļ��࣬���������ǹ��е�һЩ������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public abstract class AbstractCommand implements Command {

	private AudioPlayer player;// ¼����

	public AbstractCommand(AudioPlayer player) {
		this.player = player;
	}

	/**
	 * ����¼����
	 */
	protected AudioPlayer getPlayer() {
		return player;
	}
}