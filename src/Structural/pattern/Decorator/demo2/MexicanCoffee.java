/**
 * 
 */
package pattern.Decorator.demo2;

/**
 * ī���翧��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-12
 */
public class MexicanCoffee implements Coffee {

	@Override
	public String getName() {
		return "ī���翧��";
	}

	@Override
	public double getPrice() {
		return 1.2;
	}
}