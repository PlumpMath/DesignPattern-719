/**
 * 
 */
package pattern.Builder.demo2;

/**
 * ���⺺����������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-17
 */
public class ChickenHamburgerBuilder implements HamburgerBuilder {

    private ChickenHamburger hamburger;
	
	public void createHamburger() {
		hamburger = new ChickenHamburger();
	}
	
	public void addBread() {
		hamburger.setBread("three bread");
	}

	public void addMeat() {
		hamburger.setMeat("chicken");
	}

	public void addVegetable() {
		hamburger.setVegetable("tomato");
	}

	public IHamburger getHamburger() {
		return hamburger;
	}
}