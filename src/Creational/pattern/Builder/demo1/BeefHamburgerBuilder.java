/**
 * 
 */
package pattern.Builder.demo1;

/**
 * ţ�⺺����������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-17
 */
public class BeefHamburgerBuilder extends AbstractHamburgerBuilder {

	/**
	 * ��Ƭ���
	 */
	public void buildBread() {
		getHamburger().setBread("two bread");
	}

	/**
	 * ţ��
	 */
	public void buildMeat() {
		getHamburger().setMeat("beef");
	}

	/**
	 * ����
	 */
	public void buildVegetable() {
		getHamburger().setVegetable("lettuce");
	}
}