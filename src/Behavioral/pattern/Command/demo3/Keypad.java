/**
 * 
 */
package pattern.Command.demo3;

/**
 * 录音机上的键盘
 * <p>
 * 请求者(Invoker)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-4
 */
public class Keypad {

	private Command playCommand;// 播放命令
	
	private Command stopCommand;// 停止命令
	
	private Command rewindCommand;// 倒带命令
	
	// 原本没有宏命令的功能，后来进行功能扩展时，有了此功能
	// 对于命令模式而言，除了要增加一个具体的MacroCommand子类之外
	// 只需要在本类(Invoker)中增加一个新的方法即可，不用修改其他类
	private Command macroCommand;// 宏命令

	/**
	 * @param playCommand
	 *            播放命令
	 * @param stopCommand
	 *            停止命令
	 * @param rewindCommand
	 *            倒带命令
	 */
	public Keypad(Command playCommand, Command stopCommand,
			Command rewindCommand) {
		this.playCommand = playCommand;
		this.stopCommand = stopCommand;
		this.rewindCommand = rewindCommand;
	}

	/**
	 * 设置宏命令
	 * 
	 * @param macroCommand
	 *            宏命令
	 */
	public void setMacroCommand(Command macroCommand) {
		this.macroCommand = macroCommand;
	}

	/**
	 * 播放
	 */
	public void play() {
		playCommand.execute();
	}

	/**
	 * 停止
	 */
	public void stop() {
		stopCommand.execute();
	}

	/**
	 * 倒带
	 */
	public void rewind() {
		rewindCommand.execute();
	}

	/**
	 * 播放宏命令
	 */
	public void macro() {
		macroCommand.execute();
	}
}