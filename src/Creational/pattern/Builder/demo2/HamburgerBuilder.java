/**
 * 
 */
package pattern.Builder.demo2;

/**
 * �������������ӿ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-17
 */
public interface HamburgerBuilder {

	/**
	 * �����º���
	 */
	public void createHamburger();
	
	/**
	 * ������
	 */
	public void addBread();
	
	/**
	 * �����
	 */
	public void addMeat();
	
	/**
	 * ����߲�
	 */
	public void addVegetable();
	
	/**
	 * ���������õĺ���
	 */
	public IHamburger getHamburger();
}