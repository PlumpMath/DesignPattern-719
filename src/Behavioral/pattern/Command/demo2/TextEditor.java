/**
 * 
 */
package pattern.Command.demo2;

/**
 * �ı��༭��
 * <p>
 * ������(Receiver)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public class TextEditor {

	// ԭʼ����
	private String content = "this is the text";

	/**
	 * ���ص�ǰ����
	 */
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * ���ص�ǰ����
	 *
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return content;
	}
}