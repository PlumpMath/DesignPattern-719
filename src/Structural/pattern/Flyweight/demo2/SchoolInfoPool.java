/**
 * 
 */
package pattern.Flyweight.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * ѧУ��Ϣ�����
 * <p>
 * ��Ԫ������ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-8-3
 */
public class SchoolInfoPool {

	private static SchoolInfoPool instance = new SchoolInfoPool();

	private Map<String, SchoolInfo> pool;

	private SchoolInfoPool() {
		pool = new HashMap<String, SchoolInfo>(5);
	}

	/**
	 * ������ڷ���Ҫ��Ķ�����ֱ�ӷ��أ����򴴽�һ���¶��ֲ���������
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