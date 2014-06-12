/**
 * 
 */
package pattern.Decorator.demo1;

/**
 * ˮƽ������װ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-12
 */
public class HorizontalScrollBarDecorator extends WindowDecorator {

	public HorizontalScrollBarDecorator(Window decoratedWindow) {
		super(decoratedWindow);
	}

	public void draw() {
		drawHorizontalScrollBar();
		decoratedWindow.draw();
	}

	private void drawHorizontalScrollBar() {
		System.out.println("draw HorizontalScrollBar");
	}

	public String getDescription() {
		return decoratedWindow.getDescription()
				+ ", including horizontal scrollbars";
	}
}