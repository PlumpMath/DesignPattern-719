/**
 * 
 */
package pattern.Builder;

import java.util.Date;

/**
 * �����Ʒ������
 * <p>
 * ����ģʽ��ֱ�Ӵ�����Ʒ����Ľ�ɫ������Ҫ��ȫʵ�ֳ��������������Ľӿڡ�
 * ���������ɫ������Ӧ�ó��������ص�һЩ�࣬������Ӧ�ó�������´�����Ʒ��ʵ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-16
 */
public class ConcreteBuilder implements Builder {

	private ConcreteProduct product = new ConcreteProduct();

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