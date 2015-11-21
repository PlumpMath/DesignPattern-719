/**
 * 
 */
package pattern.Singleton.more;

/**
 * 2，传统懒汉式单例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014-6-6
 */
public final class LazySingleton {

	private static LazySingleton instance;

	private LazySingleton() {
		super();
		System.out.println("instance created");
	}

	/**
	 * 不使用 synchronized 则无法保证唯一单例。
	 * 而使用 synchronized 则会有效率上的损失。
	 */
	public synchronized static LazySingleton getInstance() {
		if(instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
