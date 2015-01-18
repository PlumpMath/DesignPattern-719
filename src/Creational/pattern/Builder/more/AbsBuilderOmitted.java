/**
 * 
 */
package pattern.Builder.more;

import java.util.Date;

/**
 * 省略抽象建造者角色
 * <p>
 * 如果设计师非常肯定系统只需要一个具体建造者角色的话，可以省略掉抽象建造者角色。
 * 抽象建造者角色存在的目的是规范具体建造者角色的行为，而系统如果只有一个具体建造者，那么这个规范者角色也就不需要了。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-21
 */
public class AbsBuilderOmitted {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Builder builder = new Builder();
		Director diretor = new Director(builder);
		diretor.construct();
		Product product = builder.retrieve();
		System.out.println(product.toString());
	}
}

class Director {

	private Builder builder;// 建造器

	public Director(Builder builder) {
		this.builder = builder;
	}

	/**
	 * 建造对象
	 */
	public void construct() {
		builder.buildPart1();
		builder.buildPart2();
	}
}

class Builder {

	private Product product = new Product();

	/**
	 * 建造零件1
	 */
	public void buildPart1() {
		product.setPart1((int) (Math.random() * 100));
	}

	/**
	 * 建造零件2
	 */
	public void buildPart2() {
		product.setPart2(new Date().toString());
	}

	/**
	 * 取回组装好的Product对象
	 */
	public Product retrieve() {
		return product;
	}
}

class Product {

	private int part1;// 零件1
	private String part2;// 零件2

	Product() {
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

	public String toString() {
		return "part1=" + part1 + "#part2=" + part2;
	}
}