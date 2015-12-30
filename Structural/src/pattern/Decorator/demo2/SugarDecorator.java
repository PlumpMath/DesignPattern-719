/**
 * 
 */
package pattern.Decorator.demo2;

/**
 * 糖装饰器
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-12
 */
public class SugarDecorator extends CoffeeDecorator {

	public SugarDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getName() {
		return coffee.getName() + " 加糖";
	}

	@Override
	public double getPrice() {
		return coffee.getPrice() + 0.1;
	}
}
