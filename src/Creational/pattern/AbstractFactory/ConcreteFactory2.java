/**
 * 
 */
package pattern.AbstractFactory;

/**
 * ���幤����2
 * <p>
 * ר�����ڴ�����Ʒ��2�еĸ�������ʵ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-24
 */
public class ConcreteFactory2 implements Factory {

	public ProductA createA() {
		return new ConcreteProductA2();
	}

	public ProductB createB() {
		return new ConcreteProductB2();
	}
}