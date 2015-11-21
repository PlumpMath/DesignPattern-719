/**
 * 
 */
package pattern.Decorator.demo1;

/**
 * 垂直下拉条装饰器
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-12
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
