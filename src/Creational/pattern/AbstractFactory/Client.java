/**
 * 
 */
package pattern.AbstractFactory;

/**
 * �ͻ��˳�����
 * <p>
 * ����ഴ�����幤������Ȼ����ù�������Ĺ�������������Ӧ�Ĳ�Ʒ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-24
 */
public class Client {

	private static Factory factory1;
	private static Factory factory2;
	
	private static ProductA productA1;
	private static ProductA productA2;
	
	private static ProductB productB1;
	private static ProductB productB2;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		factory1 = new ConcreteFactory1();
		productA1 = factory1.createA();
		System.out.println(productA1);
		productB1 = factory1.createB();
		System.out.println(productA2);
		factory2 = new ConcreteFactory2();
		productA2 = factory2.createA();
		System.out.println(productB1);
		productB2 = factory2.createB();
		System.out.println(productB2);
	}
}