/**
 * 
 */
package pattern.Builder.demo2;

/**
 * ţ�⺺����������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-17
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