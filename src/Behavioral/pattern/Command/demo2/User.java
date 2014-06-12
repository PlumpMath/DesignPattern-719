/**
 * 
 */
package pattern.Command.demo2;

/**
 * �û���
 * <p>
 * �ͻ�(Client)��ɫ��ģ���û�ʹ���ı��༭�����б༭����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public class User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ����һ���ı��༭��
		TextEditor editor = new TextEditor();
		System.out.println("��original��" + editor);
		// ���в���
		EditAction action = new EditAction();
		Command cut = new CutCommand(editor);
		action.setCommand(cut);
		action.executeCommand();
		System.out.println("��after cut��" + editor);
		action.rollbackCommand();// �ع����в�������undo
		System.out.println("��undo cut��" + editor);
		// ���в���
		cut = new CutCommand(editor);
		action.setCommand(cut);
		action.executeCommand();
		System.out.println("��after cut��" + editor);
		// ���в���
		cut = new CutCommand(editor);
		action.setCommand(cut);
		action.executeCommand();
		System.out.println("��after cut��" + editor);
		// ���Ʋ���
		Command copy = new CopyCommand(editor);
		action.setCommand(copy);
		action.executeCommand();
		System.out.println("��after copy��" + editor);
		// ճ������
		Command paste = new PasteCommand(editor, "paste");
		action.setCommand(paste);
		action.executeCommand();
		System.out.println("��after paste��" + editor);
		// ɾ������
		Command delete = new DeleteCommand(editor);
		action.setCommand(delete);
		action.executeCommand();
		System.out.println("��after delete��" + editor);
		// �ع���һ������
		action.rollbackCommand();
		System.out.println("��undo��" + editor);
		// �ع���һ������
		action.rollbackCommand();
		System.out.println("��undo��" + editor);
		// �ع���һ������
		action.rollbackCommand();
		System.out.println("��undo��" + editor);
		// �ع���һ������
		action.rollbackCommand();
		System.out.println("��undo��" + editor);
		// �ع���һ������
		action.rollbackCommand();
		System.out.println("��undo��" + editor);
	}
}