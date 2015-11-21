/**
 * 
 */
package pattern.Decorator.demo1;

/**
 * Window装饰器基类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-12
 */
public abstract class WindowDecorator implements Window {
	
	// 被装饰的Window
    protected Window decoratedWindow; 
 
    public WindowDecorator (Window decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }
}
