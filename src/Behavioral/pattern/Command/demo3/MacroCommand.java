/**
 * 
 */
package pattern.Command.demo3;

/**
 * ������ӿ�
 * <p>
 * ������ɽ�һ�鵥һ����ϲ���Ϊһ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public interface MacroCommand extends Command {

	/**
	 * ����һ������
	 */
	public void addCommand(Command command);

	/**
	 * ɾ��ָ������
	 */
	public void removeCommand(Command command);
}