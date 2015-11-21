/**
 * 
 */
package pattern.TemplateMethod;

/**
 * 客户端类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-7
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractClass clazz1 = new ConcreteClass1();
		clazz1.operation();
		AbstractClass clazz2 = new ConcreteClass2();
		clazz2.operation();
	}
}
