/**
 * 
 */
package pattern.FactoryMethod;

/**
 * 客户端程序类
 * <p>
 * 这个类创建工厂对象，然后调用工厂对象的工厂方法创建相应的产品对象
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-24
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
