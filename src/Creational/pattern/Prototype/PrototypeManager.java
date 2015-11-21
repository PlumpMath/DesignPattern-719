/**
 * 
 */
package pattern.Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型管理器(Prototype Manager)角色
 * <p>
 * 创建具体原型类的对象，并记录每一个被创建的对象。
 * <p>
 * 如果需要创建的原型对象数目较少而且比较固定的话，可以采取简单形式。
 * 在这种情况下，原型对象的引用可以由客户端自己保存。
 * 
 * 如果要创建的原型对象数目不固定的话，可以采取登记形式。
 * 在这种情况下，客户端并不保存对原型对象的引用，这个任务被交给管理器对象。
 * 在复制一个原型对象之前，管理器会先查看是否已经有一个满足条件的原型对象登记在册。
 * 如果有，则直接使用这个原型对象进行克隆；如果没有，管理器需要自行创建一个原型对象，并将其登记，然后使用它进行克隆。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-28
 */
public class PrototypeManager {

	private static PrototypeManager manager;

	private Map<String, Prototype> map;// 用来登记原型对象

	private PrototypeManager() {
		// singleton and do nothing
	}

	public synchronized static PrototypeManager getInstance() {
		if (manager == null) {
			manager = new PrototypeManager();
		}
		return manager;
	}

	/**
	 * 根据指定对象类型返回其实例
	 * 
	 * @param which
	 *            "A"、"B"、"C"
	 */
	public Prototype getPrototype(String which) {
		Prototype prototype = getMap().get(which);
		if (prototype == null) {
			if ("A".equals(which)) {
				prototype = new ConcretePrototypeA();
			} else if ("B".equals(which)) {
				prototype = new ConcretePrototypeB();
			} else {
				prototype = new ConcretePrototypeC();
			}
			registerPrototype(which, prototype);
		}
		return (Prototype) prototype.clone();
	}

	private void registerPrototype(String which, Prototype prototype) {
		getMap().put(which, prototype);
		System.out.println("put Prototype " + which + " instance into map.");
	}

	private Map<String, Prototype> getMap() {
		if (map == null) {
			map = new HashMap<String, Prototype>();
		}
		return map;
	}
}
