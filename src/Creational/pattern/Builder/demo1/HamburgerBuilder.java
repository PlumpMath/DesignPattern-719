/**
 * 
 */
package pattern.Builder.demo1;

/**
 * ������������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-17
 */
public interface HamburgerBuilder {

	/**
	 * �������
	 */
	public void buildBread();

	/**
	 * ������
	 */
	public void buildMeat();

	/**
	 * �����߲�
	 */
	public void buildVegetable();

	/**
	 * ���ؽ���õĺ�����
	 */
	public Hamburger getHamburger();
}