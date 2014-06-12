/**
 * 
 */
package pattern.Decorator.demo2;

/**
 * �ɿ���װ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-12
 */
public class ChocolateDecorator extends CoffeeDecorator {

	public ChocolateDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getName() {
		return coffee.getName() + " ���ɿ�����";
	}

	@Override
	public double getPrice() {
		return coffee.getPrice() + 0.3;
	}
}