/**
 * 
 */
package pattern.Builder.more;

import pattern.Builder.Builder;
import pattern.Builder.Director;
import pattern.Builder.Product;

/**
 * �յ�������췽��
 * <p>
 * ��һ��ϵͳ�ж����Ʒ���ʱ����ô�ܱ�֤��������Ӧ�ľ��彨�����඼��ͬ���Ľӿڣ�
 * ��Ȼ����Ʒ���ڲ��ṹϸ�ڴ���������彨������Ľӿ��޹أ���Ϊ�ӿڽ����������췽�����������ѡ�
 * ���ǽӿ�ȷʵ�涨�˾��彨��������һ��������췽����Ҳ����˵��
 * �������߽�ɫȷʵ�涨�˲�Ʒ�������ͬ����Ŀ��������Լ������м��������
 * �����һЩ��Ʒ�н϶�����������Щ��Ʒ�н��ٵ�������Ǹ���ô�죿
 * ����ģʽ����Ҫ����Щ��Ʒһ��Ҫ����ͬ��Ŀ�������
 * ���һ����Ʒ�н��ٵ����������ʹ�ÿյ�������췽������û�е������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-21
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
	 * �������1
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
	 * ȡ����װ�õ�Product����
	 */
	public Product retrieve() {
		return product;
	}
}

class OnePartProduct implements Product {

	private int part1;// ���1
	
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