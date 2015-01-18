/**
 * 
 */
package pattern.Builder.demo1;

/**
 * 顾客类
 * <p>
 * 客户端角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-17
 */
public class Customer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HamburgerBuilder builder = new BeefHamburgerBuilder();
		Cook cook = new Cook(builder);
		cook.construct();// 开始制作汉堡
		Hamburger ham = builder.getHamburger();// 取回制作好的汉堡
		System.out.println("This is beef hamburger\n" + ham);
		System.out.println();
		
		builder = new ChickenHamburgerBuilder();
		cook.setBuilder(builder);
		cook.construct();
		ham = builder.getHamburger();
		System.out.println("This is chicken hamburger\n" + ham);
		System.out.println();
		// 这是后来新出现的鱼肉汉堡建造器，建造模式对扩展性的支持。
		builder = new FishHamburgerBuilder();
		cook.setBuilder(builder);
		cook.construct();
		ham = builder.getHamburger();
		System.out.println("This is fish hamburger\n" + ham);
	}
}

/**
 * 鱼肉汉堡包建造器
 * <p>
 * 这是后来新出现的汉堡建造器，表明建造模式支持扩展
 */
class FishHamburgerBuilder extends AbstractHamburgerBuilder {

	/**
	 * 两片面包
	 */
	public void buildBread() {
		getHamburger().setBread("two bread");
	}

	/**
	 * 鱼肉
	 */
	public void buildMeat() {
		getHamburger().setMeat("fish");
	}

	/**
	 * 紫菜
	 */
	public void buildVegetable() {
		getHamburger().setVegetable("laver");
	}
}