/**
 * 
 */
package pattern.Observer.demo1;

/**
 * 字符串模型
 * <p>
 * 具体被观察者角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-10
 */
public class StringModel extends Model {

	private String content;// 内容

	public String getContent() {
		return content;
	}

	/**
	 * 内容发生变化时通知所有观察者
	 */
	public void setContent(String content) {
		this.content = content;
		notifyViews();
	}
}