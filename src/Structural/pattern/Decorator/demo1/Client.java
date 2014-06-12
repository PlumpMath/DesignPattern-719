/**
 * 
 */
package pattern.Decorator.demo1;

/**
 * �ͻ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-12
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