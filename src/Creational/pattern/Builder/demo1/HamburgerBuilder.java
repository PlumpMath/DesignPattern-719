/**
 * 
 */
package pattern.Builder.demo1;

/**
 * 汉堡包建造者
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-17
 */
public interface HamburgerBuilder {

	/**
	 * 建造面包
	 */
	public void buildBread();

	/**
	 * 建造肉
	 */
	public void buildMeat();

	/**
	 * 建造蔬菜
	 */
	public void buildVegetable();

	/**
	 * 返回建造好的汉堡包
	 */
	public Hamburger getHamburger();
}