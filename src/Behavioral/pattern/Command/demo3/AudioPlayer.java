/**
 * 
 */
package pattern.Command.demo3;

/**
 * 录音机
 * <p>
 * 接收者(Receiver)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-4
 */
public class AudioPlayer {

	/**
	 * 播放音乐
	 */
	public void playMusic() {
		System.out.println("playing.......country road,take me home.");
	}

	/**
	 * 停止
	 */
	public void stopPlaying() {
		System.out.println("stoped...........");
	}

	/**
	 * 倒带
	 */
	public void rewind() {
		System.out.println("rewinding...........");
	}
}
