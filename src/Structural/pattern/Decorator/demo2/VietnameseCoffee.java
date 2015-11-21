/**
 * 
 */
package pattern.Decorator.demo2;

/**
 * 越南咖啡
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-12
 */
public class VietnameseCoffee implements Coffee {

	@Override
	public String getName() {
		return "越南咖啡";
	}

	@Override
	public double getPrice() {
		return 1.0;
	}
}
