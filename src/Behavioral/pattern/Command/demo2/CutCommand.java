/**
 * 
 */
package pattern.Command.demo2;

/**
 * Cut剪切命令
 * <p>
 * 具体命令(ConcreteCommand)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-4
 */
public class CutCommand extends AbstractCommand {

	public CutCommand(TextEditor editor) {
		super(editor);
	}

	/**
	 * 剪切第一个单词
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
	 * 撤销剪切
	 *
	 * @see pattern.Command.demo2.Command#undo()
	 */
	@Override
	public void undo() {
		setTextAfterAction(null);
		getEditor().setContent(getTextBeforeAction());
	}
}