/**
 * 
 */
package pattern.Command.demo2;

/**
 * Copy��������
 * <p>
 * ��������(ConcreteCommand)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public class CopyCommand extends AbstractCommand {

	public CopyCommand(TextEditor editor) {
		super(editor);
	}

	@Override
	public void doAction() {
		// ...copy
	}

	@Override
	public void undo() {
		// ...un copy
	}
}