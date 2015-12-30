/**
 * 
 */
package pattern.Flyweight.composite;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂(FlyweightFactory)角色
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
	 * 单纯享元工厂方法：创建具有指定内蕴状态的享元对象
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
	 * 复合享元工厂方法：创建具有指定内蕴状态的复合享元对象
	 * 
	 * @param state
	 *            内蕴状态数组
	 */
	public synchronized Flyweight create(Character[] states) {
		CompositeFlyweight flyweight = new CompositeFlyweight();
		for (Character state : states) {
			flyweight.addFlyweight(create(state));
		}
		return flyweight;
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
