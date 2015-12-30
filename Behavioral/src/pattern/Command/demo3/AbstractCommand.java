/**
 * 
 */
package pattern.Command.demo3;

/**
 * 抽象命令基类
 * <p>
 * 作为录音机命令的基类，抽象了它们共有的一些特征。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-4
 */
public abstract class AbstractCommand implements Command {

	private AudioPlayer player;// 录音机

	public AbstractCommand(AudioPlayer player) {
		this.player = player;
	}

	/**
	 * 返回录音机
	 */
	protected AudioPlayer getPlayer() {
		return player;
	}
}
