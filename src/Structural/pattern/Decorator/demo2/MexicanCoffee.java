/**
 * 
 */
package pattern.Decorator.demo2;

/**
 * Ä«Î÷¸ç¿§·È
 * 
 * @author Áõ³¿Î°
 * 
 * ´´½¨ÈÕÆÚ£º2010-4-12
 */
public class MexicanCoffee implements Coffee {

	@Override
	public String getName() {
		return "Ä«Î÷¸ç¿§·È";
	}

	@Override
	public double getPrice() {
		return 1.2;
	}
}