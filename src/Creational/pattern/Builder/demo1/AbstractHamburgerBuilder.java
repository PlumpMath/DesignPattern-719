/**
 * 
 */
package pattern.Builder.demo1;

/**
 * ���󺺱�������������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-17
 */
public abstract class AbstractHamburgerBuilder implements HamburgerBuilder {

	private Hamburger hamburger = new Hamburger();

	public Hamburger getHamburger() {
		return hamburger;
	}
}