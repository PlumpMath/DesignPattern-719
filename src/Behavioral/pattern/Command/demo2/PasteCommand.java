/**
 * 
 */
package pattern.Command.demo2;

/**
 * Pasteճ������
 * <p>
 * ��������(ConcreteCommand)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public class PasteCommand extends AbstractCommand {

	private String clipboard = "";

	/**
	 * @param editor
	 *            �ı��༭��
	 * @param clipboard
	 *            ճ�����ı�
	 */
	public PasteCommand(TextEditor editor, String clipboard) {
		super(editor);
		this.clipboard = clipboard;
	}

	/**
	 * ��ճ�����ϵ��ı�ճ������ǰ�ı��ĺ���
	 * 
	 * @see pattern.Command.demo2.Command#doAction()
	 */
	@Override
	public void doAction() {
		String newtext = getTextBeforeAction() + " " + clipboard;
		setTextAfterAction(newtext);
		getEditor().setContent(newtext);
	}

	/**
	 * ����ճ��
	 *
	 * @see pattern.Command.demo2.Command#undo()
	 */
	@Override
	public void undo() {
		setTextAfterAction(null);
		getEditor().setContent(getTextBeforeAction());
	}
}