/**
 * 
 */
package pattern.Command.demo2;

/**
 * ����ӿ�
 * <p>
 * ����(Command)��ɫ��Ҫ��ʵ��do��undo���ܡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public interface Command {

	/**
	 * ִ������
	 */
	public void doAction();
	
	/**
	 * ����ִ��
	 */
	public void undo();
}