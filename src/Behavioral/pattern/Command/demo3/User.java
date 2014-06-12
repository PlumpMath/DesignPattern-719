/**
 * 
 */
package pattern.Command.demo3;

/**
 * �û���
 * <p>
 * �ͻ�(Client)��ɫ��ģ���û�ʹ��¼�����Ĳ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public class User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ����һ��¼����
		AudioPlayer player = new AudioPlayer();
		Command play = new PlayCommand(player);
		Command stop = new StopCommand(player);
		Command rewind = new RewindCommand(player);
		// ¼�����ļ���
		Keypad keypad = new Keypad(play,stop,rewind);
		keypad.play();
		keypad.stop();
		keypad.rewind();
		keypad.stop();
		keypad.play();
		keypad.rewind();
		System.out.println("\n************macro command************\n");
		// ������Ĳ���
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