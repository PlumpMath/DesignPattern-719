/**
 * 
 */
package pattern.Command.demo1;

/**
 * �û���
 * <p>
 * �ͻ�(Client)��ɫ��ģ���û���ң�������ص��Ӻ͵��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-3
 */
public class User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ���һ��ң����
		RemoteControlUnit rcunit = new RemoteControlUnit();
		Television tv = new Television();
		Light light = new Light();
		// �򿪵���
		Command turnOn = new TurnOnCommand(tv);
		rcunit.setCommand(turnOn);
		rcunit.executeCommand();
		// �رյ���
		Command turnoff = new TurnOffCommand(tv);
		rcunit.setCommand(turnoff);
		rcunit.executeCommand();
		// �򿪵��
		turnOn = new TurnOnCommand(light);
		rcunit.setCommand(turnOn);
		rcunit.executeCommand();
		// �رյ��
		turnoff = new TurnOffCommand(light);
		rcunit.setCommand(turnoff);
		rcunit.executeCommand();
	}
}