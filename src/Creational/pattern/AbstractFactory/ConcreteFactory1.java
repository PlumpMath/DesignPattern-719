/**
 * 
 */
package pattern.AbstractFactory;

/**
 * ���幤����1
 * <p>
 * ר�����ڴ�����Ʒ��1�еĸ�������ʵ��
 * <p>
 * ʵ���˳��󹤳��ӿڵľ����ֱ࣬���ڿͻ��˵ĵ����´�����Ʒ��ʵ��
 * ����ѡ����ʵĲ�Ʒ������߼������߼�����Ӧ��ϵͳ����ҵ�߼�������ص�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-24
 */
public class ConcreteFactory1 implements Factory {

	public ProductA createA() {
		return new ConcreteProductA1();
	}

	public ProductB createB() {
		return new ConcreteProductB1();
	}
}