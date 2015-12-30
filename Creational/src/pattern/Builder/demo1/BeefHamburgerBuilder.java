/**
 * 
 */
package pattern.Builder.demo1;

/**
 * 牛肉汉堡包建造器
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-17
 */
public class BeefHamburgerBuilder extends AbstractHamburgerBuilder {

	/**
	 * 两片面包
	 */
	public void buildBread() {
		getHamburger().setBread("two bread");
	}

	/**
	 * 牛肉
	 */
	public void buildMeat() {
		getHamburger().setMeat("beef");
	}

	/**
	 * 生菜
	 */
	public void buildVegetable() {
		getHamburger().setVegetable("lettuce");
	}
}
