/**
 * 
 */
package pattern.Decorator.demo2;

/**
 * ţ��װ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-12
 */
public class MilkDecorator extends CoffeeDecorator {

	public MilkDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getName() {
		return coffee.getName() + " ��ţ��";
	}

	@Override
	public double getPrice() {
		return coffee.getPrice() + 0.2;
	}
}