/**
 * 
 */
package pattern.Builder.demo2;

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
		IHamburger ham = builder.getHamburger();// 取回制作好的汉堡
		System.out.println(ham);
		System.out.println();
		
		builder = new ChickenHamburgerBuilder();
		cook.setBuilder(builder);
		cook.construct();
		ham = builder.getHamburger();
		System.out.println(ham);
		System.out.println();
		
		builder = new FishHamburgerBuilder();
		cook.setBuilder(builder);
		cook.construct();
		ham = builder.getHamburger();
		System.out.println(ham);
	}

}

/**
 * 鱼肉汉堡包
 * <p>
 * 这是后来新出现的汉堡品种，表明建造模式支持可扩展性
 */
class FishHamburger extends AbstractHamburger {

	FishHamburger() {
		super();
		System.out.println("This is fish hamburger.");
	}
}

/**
 * 鱼肉汉堡包建造器
 * <p>
 * 这是后来新出现的汉堡建造器，表明建造模式支持可扩展性
 */
class FishHamburgerBuilder implements HamburgerBuilder {

	private FishHamburger hamburger;

	public void createHamburger() {
		hamburger = new FishHamburger();
	}

	public void addBread() {
		hamburger.setBread("two bread");
	}

	public void addMeat() {
		hamburger.setMeat("fish");
	}

	public void addVegetable() {
		hamburger.setVegetable("laver");
	}

	public IHamburger getHamburger() {
		return hamburger;
	}
}