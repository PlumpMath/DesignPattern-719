/**
 * 
 */
package pattern.Command.demo3;

/**
 * ¼����
 * <p>
 * ������(Receiver)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public class AudioPlayer {

	/**
	 * ��������
	 */
	public void playMusic() {
		System.out.println("playing.......country road,take me home.");
	}

	/**
	 * ֹͣ
	 */
	public void stopPlaying() {
		System.out.println("stoped...........");
	}

	/**
	 * ����
	 */
	public void rewind() {
		System.out.println("rewinding...........");
	}
}