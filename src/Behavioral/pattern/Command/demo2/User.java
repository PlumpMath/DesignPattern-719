/**
 * 
 */
package pattern.Command.demo2;

/**
 * 用户类
 * <p>
 * 客户(Client)角色，模拟用户使用文本编辑器进行编辑操作
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-4
 */
public class User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 操作一个文本编辑器
		TextEditor editor = new TextEditor();
		System.out.println("【original】" + editor);
		// 剪切操作
		EditAction action = new EditAction();
		Command cut = new CutCommand(editor);
		action.setCommand(cut);
		action.executeCommand();
		System.out.println("【after cut】" + editor);
		action.rollbackCommand();// 回滚剪切操作，即undo
		System.out.println("【undo cut】" + editor);
		// 剪切操作
		cut = new CutCommand(editor);
		action.setCommand(cut);
		action.executeCommand();
		System.out.println("【after cut】" + editor);
		// 剪切操作
		cut = new CutCommand(editor);
		action.setCommand(cut);
		action.executeCommand();
		System.out.println("【after cut】" + editor);
		// 复制操作
		Command copy = new CopyCommand(editor);
		action.setCommand(copy);
		action.executeCommand();
		System.out.println("【after copy】" + editor);
		// 粘贴操作
		Command paste = new PasteCommand(editor, "paste");
		action.setCommand(paste);
		action.executeCommand();
		System.out.println("【after paste】" + editor);
		// 删除操作
		Command delete = new DeleteCommand(editor);
		action.setCommand(delete);
		action.executeCommand();
		System.out.println("【after delete】" + editor);
		// 回滚上一个操作
		action.rollbackCommand();
		System.out.println("【undo】" + editor);
		// 回滚上一个操作
		action.rollbackCommand();
		System.out.println("【undo】" + editor);
		// 回滚上一个操作
		action.rollbackCommand();
		System.out.println("【undo】" + editor);
		// 回滚上一个操作
		action.rollbackCommand();
		System.out.println("【undo】" + editor);
		// 回滚上一个操作
		action.rollbackCommand();
		System.out.println("【undo】" + editor);
	}
}