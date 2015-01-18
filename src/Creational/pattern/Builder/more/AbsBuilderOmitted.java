/**
 * 
 */
package pattern.Builder.more;

import java.util.Date;

/**
 * ʡ�Գ������߽�ɫ
 * <p>
 * ������ʦ�ǳ��϶�ϵͳֻ��Ҫһ�����彨���߽�ɫ�Ļ�������ʡ�Ե��������߽�ɫ��
 * �������߽�ɫ���ڵ�Ŀ���ǹ淶���彨���߽�ɫ����Ϊ����ϵͳ���ֻ��һ�����彨���ߣ���ô����淶�߽�ɫҲ�Ͳ���Ҫ�ˡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-21
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

	private Builder builder;// ������

	public Director(Builder builder) {
		this.builder = builder;
	}

	/**
	 * �������
	 */
	public void construct() {
		builder.buildPart1();
		builder.buildPart2();
	}
}

class Builder {

	private Product product = new Product();

	/**
	 * �������1
	 */
	public void buildPart1() {
		product.setPart1((int) (Math.random() * 100));
	}

	/**
	 * �������2
	 */
	public void buildPart2() {
		product.setPart2(new Date().toString());
	}

	/**
	 * ȡ����װ�õ�Product����
	 */
	public Product retrieve() {
		return product;
	}
}

class Product {

	private int part1;// ���1
	private String part2;// ���2

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