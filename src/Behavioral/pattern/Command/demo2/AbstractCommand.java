/**
 * 
 */
package pattern.Command.demo2;

/**
 * ����༭�������
 * <p>
 * ��Ϊ�༭����Ļ��࣬���������ǹ��е�һЩ������
 * ����ֱ��¼������ִ��ǰ��ִ�к���ı����ݣ��Ա���undo������ʵ�֡�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public abstract class AbstractCommand implements Command {

	// �ı��༭���������������
	private TextEditor editor;
	// ����ִ��ǰ���ı�
	private String textBeforeAction;
	// ����ִ�к���ı�
	private String textAfterAction;

	/**
	 * @param editor
	 *            �ı��༭��
	 */
	public AbstractCommand(TextEditor editor) {
		this.editor = editor;
		this.textBeforeAction = editor.getContent();
	}

	protected TextEditor getEditor() {
		return editor;
	}

	/**
	 * ��������ִ��ǰ���ı�
	 */
	public String getTextBeforeAction() {
		return textBeforeAction;
	}
	
	/**
	 * ��������ִ�к���ı�
	 */
	public String getTextAfterAction() {
		return textAfterAction;
	}

	/**
	 * ��������ִ�к���ı�
	 */
	protected void setTextAfterAction(String textAfterAction) {
		this.textAfterAction = textAfterAction;
	}
}