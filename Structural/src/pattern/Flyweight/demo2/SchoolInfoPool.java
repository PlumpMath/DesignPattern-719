/**
 * 
 */
package pattern.Flyweight.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * 学校信息对象池
 * <p>
 * 享元工厂角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-8-3
 */
public class SchoolInfoPool {

	private static SchoolInfoPool instance = new SchoolInfoPool();

	private Map<String, SchoolInfo> pool;

	private SchoolInfoPool() {
		pool = new HashMap<String, SchoolInfo>(5);
	}

	/**
	 * 如果存在符合要求的对象则直接返回，否则创建一个新兑现并加入对象池
	 */
	public synchronized SchoolInfo create(String name, int grade) {
		String key = name + grade;
		if (pool.get(key) == null) {
			pool.put(key, new SchoolInfo(name, grade));
		}
		return pool.get(key);
	}

	public static SchoolInfoPool getInstance() {
		return instance;
	}
}
