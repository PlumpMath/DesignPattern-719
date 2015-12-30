/**
 * 
 */
package pattern.Command.demo2;

/**
 * Paste粘贴命令
 * <p>
 * 具体命令(ConcreteCommand)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-4
 */
public class PasteCommand extends AbstractCommand {

	private String clipboard = "";

	/**
	 * @param editor
	 *            文本编辑器
	 * @param clipboard
	 *            粘贴的文本
	 */
	public PasteCommand(TextEditor editor, String clipboard) {
		super(editor);
		this.clipboard = clipboard;
	}

	/**
	 * 将粘贴板上的文本粘贴到当前文本的后面
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
	 * 撤销粘贴
	 *
	 * @see pattern.Command.demo2.Command#undo()
	 */
	@Override
	public void undo() {
		setTextAfterAction(null);
		getEditor().setContent(getTextBeforeAction());
	}
}
