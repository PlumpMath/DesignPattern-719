/**
 * 
 */
package pattern.TemplateMethod;

/**
 * �ͻ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-7
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