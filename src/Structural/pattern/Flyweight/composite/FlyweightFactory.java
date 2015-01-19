/**
 * 
 */
package pattern.Flyweight.composite;

import java.util.HashMap;
import java.util.Map;

/**
 * ��Ԫ����(FlyweightFactory)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-8-2
 */
public class FlyweightFactory {

	private Map<Character, Flyweight> map;

	// ϵͳ����ֻ��Ҫһ����Ԫ������ʵ�������Բ��õ���ģʽ
	private static FlyweightFactory singleton = new FlyweightFactory();

	private FlyweightFactory() {
		this.map = new HashMap<Character, Flyweight>();
	}

	public static FlyweightFactory getInstance() {
		return singleton;
	}

	/**
	 * ������Ԫ������������������ָ������״̬����Ԫ����
	 * 
	 * @param state
	 *            ����״̬
	 */
	public synchronized Flyweight create(Character state) {
		if (map.get(state) == null) {
			map.put(state, new ConcreteFlyweight(state));
		}
		return map.get(state);
	}

	/**
	 * ������Ԫ������������������ָ������״̬�ĸ�����Ԫ����
	 * 
	 * @param state
	 *            ����״̬����
	 */
	public synchronized Flyweight create(Character[] states) {
		CompositeFlyweight flyweight = new CompositeFlyweight();
		for (Character state : states) {
			flyweight.addFlyweight(create(state));
		}
		return flyweight;
	}

	/**
	 * ��ӡ�����е���Ԫ����Ϊϵͳ�ṩ������Ϣ
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