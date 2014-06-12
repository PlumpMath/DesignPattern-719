/**
 * 
 */
package pattern.Builder;

/**
 * 具体产品类
 * <p>
 * 一般来说，每有一个产品类，就有一个相应的具体建造者类。
 * 这些产品应当有一样数目的零件，而每有一个零件就相应地在所有的建造者角色里有一个建造方法。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-16
 */
public class ConcreteProduct implements Product {

	private int part1;// 零件1
	private String part2;// 零件2
	
	ConcreteProduct() {
		// do nothing
	}

	public int getPart1() {
		return part1;
	}

	void setPart1(int part1) {
		this.part1 = part1;
	}

	public String getPart2() {
		return part2;
	}

	void setPart2(String part2) {
		this.part2 = part2;
	}
	
	public String toString(){
		return "part1=" + part1 + "#part2=" + part2; 
	}
}