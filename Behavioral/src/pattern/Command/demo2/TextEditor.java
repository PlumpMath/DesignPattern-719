/**
 * 
 */
package pattern.Command.demo2;

/**
 * 文本编辑器
 * <p>
 * 接收者(Receiver)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-4
 */
public class TextEditor {

	// 原始内容
	private String content = "this is the text";

	/**
	 * 返回当前内容
	 */
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * 返回当前内容
	 *
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return content;
	}
}
