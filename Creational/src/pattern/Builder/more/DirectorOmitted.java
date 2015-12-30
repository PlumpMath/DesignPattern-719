/**
 * 
 */
package pattern.Builder.more;

import java.util.Date;

/**
 * 省略导演者角色
 * <p>
 * 在具体建造者只有一个的情况下，如果抽象建造者角色已经被省略掉，那么还可以进一步省略掉导演者角色。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-21
 */
public class DirectorOmitted {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DirectorBuilder builder = new DirectorBuilder();
		builder.construct();
		Product product = builder.retrieve();
		System.out.println(product.toString());
	}
}

class DirectorBuilder {

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

	/**
	 * 建造对象
	 */
	public void construct() {
		buildPart1();
		buildPart2();
	}
}
