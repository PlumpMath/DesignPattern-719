/**
 * 
 */
package pattern.Decorator.demo2;

/**
 * 牛奶装饰器
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-12
 */
public class MilkDecorator extends CoffeeDecorator {

	public MilkDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getName() {
		return coffee.getName() + " 加牛奶";
	}

	@Override
	public double getPrice() {
		return coffee.getPrice() + 0.2;
	}
}