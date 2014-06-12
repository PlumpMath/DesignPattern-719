/**
 * 
 */
package pattern.Builder.demo1;

/**
 * ���⺺����������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-17
 */
public class ChickenHamburgerBuilder extends AbstractHamburgerBuilder {

	/**
	 * ��Ƭ���
	 */
	public void buildBread() {
		getHamburger().setBread("three bread");
	}

	/**
	 * ����
	 */
	public void buildMeat() {
		getHamburger().setMeat("chicken");
	}

	/**
	 * ����
	 */
	public void buildVegetable() {
		getHamburger().setVegetable("tomato");
	}
}