/**
 * 
 */
package pattern.FactoryMethod;

/**
 * ���幤����1
 * <p>
 * ר�����ڴ���ConcreteProduct1ʵ��
 * <p>
 * ʵ���˳��󹤳��ӿڵľ����࣬������Ӧ��������ص��߼�
 * �����ܵ�Ӧ�ó���ĵ����Դ�����Ʒ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-24
 */
public class ConcreteFactory1 implements Factory {

	/**
	 * ����Product��ʵ��
	 */
	public Product create() {
		return new ConcreteProduct1();
	}
}