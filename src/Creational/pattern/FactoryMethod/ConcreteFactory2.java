/**
 * 
 */
package pattern.FactoryMethod;

/**
 * ���幤����2
 * <p>
 * ר�����ڴ���ConcreteProduct2ʵ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-24
 */
public class ConcreteFactory2 implements Factory {

	/**
	 * ����Product��ʵ��
	 */
	public Product create() {
		return new ConcreteProduct2();
	}
}