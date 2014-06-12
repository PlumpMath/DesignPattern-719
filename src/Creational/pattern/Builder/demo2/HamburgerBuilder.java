/**
 * 
 */
package pattern.Builder.demo2;

/**
 * 汉堡包建造器接口
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-17
 */
public interface HamburgerBuilder {

	/**
	 * 创建新汉堡
	 */
	public void createHamburger();
	
	/**
	 * 添加面包
	 */
	public void addBread();
	
	/**
	 * 添加肉
	 */
	public void addMeat();
	
	/**
	 * 添加蔬菜
	 */
	public void addVegetable();
	
	/**
	 * 返回制作好的汉堡
	 */
	public IHamburger getHamburger();
}