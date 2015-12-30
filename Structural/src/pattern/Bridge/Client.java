/**
 * 
 */
package pattern.Bridge;

/**
 * 客户端类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-26
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Abstraction abs = new RefinedAbstraction(new ConcreteImplementorA());
		abs.operation();
		// 通过向不同的实现化对象委派，来达到动态地转换自己的功能的目的
		abs.setImplementor(new ConcreteImplementorB());
		abs.operation();
	}
}
