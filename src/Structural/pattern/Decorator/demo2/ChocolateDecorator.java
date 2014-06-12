/**
 * 
 */
package pattern.Decorator.demo2;

/**
 * 巧克力装饰器
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-12
 */
public class ChocolateDecorator extends CoffeeDecorator {

	public ChocolateDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getName() {
		return coffee.getName() + " 加巧克力粉";
	}

	@Override
	public double getPrice() {
		return coffee.getPrice() + 0.3;
	}
}