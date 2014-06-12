/**
 * 
 */
package pattern.FactoryMethod;

/**
 * �ͻ��˳�����
 * <p>
 * ����ഴ����������Ȼ����ù�������Ĺ�������������Ӧ�Ĳ�Ʒ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-24
 */
public class Client {

	private static Factory factory1;
	private static Factory factory2;
	
	private static Product product1;
	private static Product product2;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		factory1 = new ConcreteFactory1();
		product1 = factory1.create();
		System.out.println(product1);
		factory2 = new ConcreteFactory2();
		product2 = factory2.create();
		System.out.println(product2);
	}
}