/**
 * 
 */
package pattern.Decorator.demo2;

/**
 * ��װ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-12
 */
public class SugarDecorator extends CoffeeDecorator {

	public SugarDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getName() {
		return coffee.getName() + " ����";
	}

	@Override
	public double getPrice() {
		return coffee.getPrice() + 0.1;
	}
}