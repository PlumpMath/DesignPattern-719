/**
 * 
 */
package pattern.Command.demo2;

/**
 * Deleteɾ������
 * <p>
 * ��������(ConcreteCommand)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public class DeleteCommand extends AbstractCommand {

	public DeleteCommand(TextEditor editor) {
		super(editor);
	}

	/**
	 * ɾ����һ������
	 *
	 * @see pattern.Command.demo2.Command#doAction()
	 */
	@Override
	public void doAction() {
		String newtext = getTextBeforeAction().substring(
				getTextBeforeAction().indexOf(" ")).trim();
		setTextAfterAction(newtext);
		getEditor().setContent(newtext);
	}

	/**
	 * ����ɾ��
	 *
	 * @see pattern.Command.demo2.Command#doAction()
	 */
	@Override
	public void undo() {
		setTextAfterAction(null);
		getEditor().setContent(getTextBeforeAction());
	}
}