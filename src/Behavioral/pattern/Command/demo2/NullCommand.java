/**
 * 
 */
package pattern.Command.demo2;

/**
 * ������
 * <p>
 * ��������(ConcreteCommand)��ɫ��NullObjectģʽ��Ӧ�á�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public class NullCommand implements Command {

	@Override
	public void doAction() {
		// do nothing
	}

	@Override
	public void undo() {
		// do nothing
	}
}