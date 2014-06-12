/**
 * 
 */
package pattern.Builder.demo1;

/**
 * 抽象汉堡包建造器基类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-17
 */
public abstract class AbstractHamburgerBuilder implements HamburgerBuilder {

	private Hamburger hamburger = new Hamburger();

	public Hamburger getHamburger() {
		return hamburger;
	}
}