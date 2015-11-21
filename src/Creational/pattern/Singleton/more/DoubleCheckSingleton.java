/**
 * 
 */
package pattern.Singleton.more;

/**
 * 3，双重校验懒汉式单例
 * <p>
 * 这种方式在当前Java的内存模型中是无效的。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014-6-6
 */
public final class DoubleCheckSingleton {

	private static DoubleCheckSingleton instance;

	private DoubleCheckSingleton() {
		super();
		System.out.println("instance created");
	}

	public static DoubleCheckSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}
}
