/**
 * 
 */
package pattern.Builder.more;

import pattern.Builder.Builder;
import pattern.Builder.Director;
import pattern.Builder.Product;

/**
 * 空实现的零件建造方法
 * <p>
 * 抽象建造者角色规定了产品类必须有同样数目的零件，以及具体有几个零件。
 * 如果有一些产品有较多的零件，而有些产品有较少的零件，那该怎么办？
 * 建造模式并不要求这些产品一定要有相同数目的零件。如果一个产品有较少的零件，可以使用空的零件建造方法忽略不需要的零件。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-21
 */
public class EmptyBuildMethod {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OnePartProductBuilder builder = new OnePartProductBuilder();
		Director diretor = new Director(builder);
		diretor.construct();
		Product product = builder.retrieve();
		System.out.println(product.toString());
	}
}

class OnePartProductBuilder implements Builder {

	private OnePartProduct product = new OnePartProduct();

	/**
	 * 建造零件1
	 */
	public void buildPart1() {
		product.setPart1((int) (Math.random() * 100));
	}

	/**
	 * empty method
	 */
	public void buildPart2() {
		// do nothing
	}

	/**
	 * 取回组装好的Product对象
	 */
	public Product retrieve() {
		return product;
	}
}

class OnePartProduct implements Product {

	private int part1;// 零件1
	
	OnePartProduct() {
		// do nothing
	}

	public int getPart1() {
		return part1;
	}

	void setPart1(int part1) {
		this.part1 = part1;
	}
	
	public String toString(){
		return "part1=" + part1; 
	}
}
