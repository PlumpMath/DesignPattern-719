/**
 * 
 */
package pattern.Observer.demo1;

/**
 * �ַ���ģ��
 * <p>
 * ���屻�۲��߽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-10
 */
public class StringModel extends Model {

	private String content;// ����

	public String getContent() {
		return content;
	}

	/**
	 * ���ݷ����仯ʱ֪ͨ���й۲���
	 */
	public void setContent(String content) {
		this.content = content;
		notifyViews();
	}
}