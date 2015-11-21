/**
 * 
 */
package pattern.Builder.demo2;

/**
 * 牛肉汉堡包建造器
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-17
 */
public class BeefHamburgerBuilder implements HamburgerBuilder {

	private BeefHamburger hamburger;

	public void createHamburger() {
		hamburger = new BeefHamburger();
	}

	public void addBread() {
		hamburger.setBread("two bread");
	}

	public void addMeat() {
		hamburger.setMeat("beef");
	}

	public void addVegetable() {
		hamburger.setVegetable("lettuce");
	}

	public IHamburger getHamburger() {
		return hamburger;
	}
}
