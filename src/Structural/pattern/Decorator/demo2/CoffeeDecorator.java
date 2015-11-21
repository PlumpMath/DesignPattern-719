/**
 * 
 */
package pattern.Decorator.demo2;

/**
 * 咖啡装饰器基类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-12
 */
public abstract class CoffeeDecorator implements Coffee {

	// 被装饰的咖啡
	protected Coffee coffee;
	
	public CoffeeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}
}
