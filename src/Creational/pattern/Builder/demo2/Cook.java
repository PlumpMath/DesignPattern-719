/**
 * 
 */
package pattern.Builder.demo2;

/**
 * 厨师类
 * <p>
 * 导演者角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-17
 */
public class Cook {

	private HamburgerBuilder builder;
	
	public Cook(HamburgerBuilder builder){
		this.builder = builder;
	}

	/**
	 * 制作汉堡
	 * <p>
	 * 制作汉堡的过程(或者逻辑)只有厨师(导演者)知道
	 */
	public void construct(){
		// 先放面包、然后放肉、最后放蔬菜
		builder.createHamburger();
		builder.addBread();
		builder.addMeat();
		builder.addVegetable();
	}
	
	public void setBuilder(HamburgerBuilder builder) {
		this.builder = builder;
	}
}