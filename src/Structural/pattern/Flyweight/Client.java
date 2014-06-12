/**
 * 
 */
package pattern.Flyweight;

/**
 * 客户端(Client)角色
 * <p>
 * 本角色需要维护一个对所有享元对象的引用。本角色需要自行存储所有享元对象的外蕴状态。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-8-2
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 客户端只能使用享元工厂创建享元对象
		FlyweightFactory factory = FlyweightFactory.getInstance();
		Flyweight f1 = factory.create('a');
		// 以参量形式传入一个外蕴状态
		f1.operation("1st");
		Flyweight f2 = factory.create('b');
		f2.operation("2nd");
		Flyweight f3 = factory.create('a');
		f3.operation("3rd");
		factory.printAllFlyweights();
	}
}