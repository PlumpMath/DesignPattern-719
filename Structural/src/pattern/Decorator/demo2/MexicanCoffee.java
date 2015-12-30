/**
 * 
 */
package pattern.Decorator.demo2;

/**
 * 墨西哥咖啡
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-12
 */
public class MexicanCoffee implements Coffee {

	@Override
	public String getName() {
		return "墨西哥咖啡";
	}

	@Override
	public double getPrice() {
		return 1.2;
	}
}
