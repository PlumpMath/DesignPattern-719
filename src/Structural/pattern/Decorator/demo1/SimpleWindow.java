/**
 * 
 */
package pattern.Decorator.demo1;

/**
 * �򵥴���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-12
 */
public class SimpleWindow implements Window {
	
    public void draw() {
		System.out.println("draw SimpleWindow.");
	}

	public String getDescription() {
		return "simple window";
	}
}