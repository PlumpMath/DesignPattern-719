/**
 * 
 */
package pattern.Command.demo2;

/**
 * Cut��������
 * <p>
 * ��������(ConcreteCommand)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public class CutCommand extends AbstractCommand {

	public CutCommand(TextEditor editor) {
		super(editor);
	}

	/**
	 * ���е�һ������
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
	 * ��������
	 *
	 * @see pattern.Command.demo2.Command#undo()
	 */
	@Override
	public void undo() {
		setTextAfterAction(null);
		getEditor().setContent(getTextBeforeAction());
	}
}