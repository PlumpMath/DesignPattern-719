/**
 * 
 */
package pattern.Command.demo2;

/**
 * 抽象编辑命令基类
 * <p>
 * 作为编辑命令的基类，抽象了它们共有的一些特征。
 * 比如分别记录了命令执行前和执行后的文本内容，以便于undo操作的实现。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-4
 */
public abstract class AbstractCommand implements Command {

	// 文本编辑器，即命令接收者
	private TextEditor editor;
	// 命令执行前的文本
	private String textBeforeAction;
	// 命令执行后的文本
	private String textAfterAction;

	/**
	 * @param editor
	 *            文本编辑器
	 */
	public AbstractCommand(TextEditor editor) {
		this.editor = editor;
		this.textBeforeAction = editor.getContent();
	}

	protected TextEditor getEditor() {
		return editor;
	}

	/**
	 * 返回命令执行前的文本
	 */
	public String getTextBeforeAction() {
		return textBeforeAction;
	}
	
	/**
	 * 返回命令执行后的文本
	 */
	public String getTextAfterAction() {
		return textAfterAction;
	}

	/**
	 * 设置命令执行后的文本
	 */
	protected void setTextAfterAction(String textAfterAction) {
		this.textAfterAction = textAfterAction;
	}
}
