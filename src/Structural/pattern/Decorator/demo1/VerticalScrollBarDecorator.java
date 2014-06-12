/**
 * 
 */
package pattern.Decorator.demo1;

/**
 * ��ֱ������װ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-12
 */
public class VerticalScrollBarDecorator extends WindowDecorator {
	
    public VerticalScrollBarDecorator(Window decoratedWindow) {
		super(decoratedWindow);
	}

	public void draw() {
		drawVerticalScrollBar();
		decoratedWindow.draw();
	}

	private void drawVerticalScrollBar() {
		System.out.println("draw VerticalScrollBar");
	}

	public String getDescription() {
		return decoratedWindow.getDescription()
				+ ", including vertical scrollbars";
	}
}