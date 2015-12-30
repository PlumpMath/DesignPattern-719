/**
 * 
 */
package pattern.Command.demo3;

/**
 * 用户类
 * <p>
 * 客户(Client)角色，模拟用户使用录音机的操作
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-4
 */
public class User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 操作一个录音机
		AudioPlayer player = new AudioPlayer();
		Command play = new PlayCommand(player);
		Command stop = new StopCommand(player);
		Command rewind = new RewindCommand(player);
		// 录音机的键盘
		Keypad keypad = new Keypad(play,stop,rewind);
		keypad.play();
		keypad.stop();
		keypad.rewind();
		keypad.stop();
		keypad.play();
		keypad.rewind();
		System.out.println("\n************macro command************\n");
		// 宏命令的操作
		MacroCommand macro = new MacroCommandListImpl();
		macro.addCommand(play);
		macro.addCommand(stop);
		macro.addCommand(rewind);
		macro.addCommand(stop);
		macro.addCommand(play);
		macro.addCommand(rewind);

		keypad.setMacroCommand(macro);
		keypad.macro();
	}
}
