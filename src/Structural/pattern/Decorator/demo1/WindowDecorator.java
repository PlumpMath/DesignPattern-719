/**
 * 
 */
package pattern.Decorator.demo1;

/**
 * Windowװ��������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-12
 */
public abstract class WindowDecorator implements Window {
	
	// ��װ�ε�Window
    protected Window decoratedWindow; 
 
    public WindowDecorator (Window decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }
}