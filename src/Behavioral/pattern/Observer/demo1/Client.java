/**
 * 
 */
package pattern.Observer.demo1;

/**
 * 客户端
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-10
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringModel model = new StringModel();
		model.addView(new ChineseView());
		model.addView(new EnglishView());
		model.setContent("content1");
		model.setContent("content2");
	}
}