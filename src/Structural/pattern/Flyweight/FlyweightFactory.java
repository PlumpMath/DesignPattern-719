/**
 * 
 */
package pattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂(FlyweightFactory)角色
 * <p>
 * 本角色负责创建和管理享元角色。 本角色必须保证享元对象可以被系统适当地共享。
 * 当一个客户端对象调用一个享元对象的时候，享元工厂角色会检查系统中是否已经有一个符合要求的享元对象。
 * 如果已经有了，享元工厂角色就应当提供这个已有的享元对象；
 * 如果系统中没有一个适当的享元对象的话，享元工厂角色就应当创建一个合适的享元对象。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-8-2
 */
public class FlyweightFactory {

	private Map<Character, Flyweight> map;

	// 系统往往只需要一个享元工厂的实例，所以采用单例模式
	private static FlyweightFactory singleton = new FlyweightFactory();

	private FlyweightFactory() {
		this.map = new HashMap<Character, Flyweight>();
	}

	public static FlyweightFactory getInstance() {
		return singleton;
	}

	/**
	 * 创建具有指定内蕴状态的享元对象
	 * 
	 * @param state
	 *            内蕴状态
	 */
	public synchronized Flyweight create(Character state) {
		if (map.get(state) == null) {
			map.put(state, new ConcreteFlyweight(state));
		}
		return map.get(state);
	}

	/**
	 * 打印出所有的享元对象，为系统提供辅助信息
	 */
	public void printAllFlyweights() {
		System.out.println("******All Flyweights******");
		for (Character c : map.keySet()) {
			System.out.print("key=" + c);
			System.out.println(",flyweight=" + map.get(c));
		}
		System.out.println("**************************");
	}
}
