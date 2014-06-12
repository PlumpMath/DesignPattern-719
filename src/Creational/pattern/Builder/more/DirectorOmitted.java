/**
 * 
 */
package pattern.Builder.more;

import java.util.Date;

/**
 * ʡ�Ե����߽�ɫ
 * <p>
 * �ھ��彨����ֻ��һ��������£�����������߽�ɫ
 * �Ѿ���ʡ�Ե�����ô�����Խ�һ��ʡ�Ե������߽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-21
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

	/**
	 * �������
	 */
	public void construct() {
		buildPart1();
		buildPart2();
	}
}