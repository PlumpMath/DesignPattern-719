/**
 * 
 */
package pattern.Decorator.demo2;

/**
 * Խ�Ͽ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-12
 */
public class VietnameseCoffee implements Coffee {

	@Override
	public String getName() {
		return "Խ�Ͽ���";
	}

	@Override
	public double getPrice() {
		return 1.0;
	}
}