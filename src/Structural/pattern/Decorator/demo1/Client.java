/**
 * 
 */
package pattern.Decorator.demo1;

/**
 * 客户端类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-12
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Window decoratedWindow = new HorizontalScrollBarDecorator(
				new VerticalScrollBarDecorator(new SimpleWindow()));
		System.out.println(decoratedWindow.getDescription());
		decoratedWindow.draw();
	}
}