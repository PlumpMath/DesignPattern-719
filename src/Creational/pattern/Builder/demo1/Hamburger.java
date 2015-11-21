/**
 * 
 */
package pattern.Builder.demo1;

/**
 * 汉堡包
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-17
 */
public class Hamburger {

	private String bread;// 面包
	private String meat;// 肉
	private String vegetable;// 蔬菜

	Hamburger() {
	}
	
	public String getBread() {
		return bread;
	}

	void setBread(String bread) {
		this.bread = bread;
	}

	public String getMeat() {
		return meat;
	}

	void setMeat(String meat) {
		this.meat = meat;
	}

	public String getVegetable() {
		return vegetable;
	}

	void setVegetable(String vegetable) {
		this.vegetable = vegetable;
	}

	public String toString() {
		return "bread:" + getBread() + "\nmeat:" + getMeat() + "\nvegetable:"
				+ getVegetable();
	}
}
