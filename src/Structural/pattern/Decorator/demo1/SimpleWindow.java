/**
 * 
 */
package pattern.Decorator.demo1;

/**
 * 简单窗口
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-12
 */
public class SimpleWindow implements Window {
	
    public void draw() {
		System.out.println("draw SimpleWindow.");
	}

	public String getDescription() {
		return "simple window";
	}
}
