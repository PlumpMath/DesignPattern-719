/**
 * 
 */
package pattern.Builder.demo1;

/**
 * 鸡肉汉堡包建造器
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-17
 */
public class ChickenHamburgerBuilder extends AbstractHamburgerBuilder {

	/**
	 * 三片面包
	 */
	public void buildBread() {
		getHamburger().setBread("three bread");
	}

	/**
	 * 鸡肉
	 */
	public void buildMeat() {
		getHamburger().setMeat("chicken");
	}

	/**
	 * 番茄
	 */
	public void buildVegetable() {
		getHamburger().setVegetable("tomato");
	}
}
