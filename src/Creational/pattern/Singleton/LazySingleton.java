/**
 * 
 */
package pattern.Singleton;

/**
 * 懒汉式单例类
 * <p>
 * 当类被加载时不会创建唯一的实例，只有使用该实例的时候它才会被创建，所以是懒汉式。
 * <p>
 * 和饿汉式单例类的比较：
 * 饿汉式单例类在类被加载时就会创建唯一的实例，单从资源利用效率的角度讲，这个比懒汉式单例类稍差些，
 * 从速度和反应时间角度讲，则比懒汉式单例类稍好些。然而懒汉式单例类在实例化时必须处理好在多个线程同时首次引用实例时的访问限制问题，
 * 特别是当单例类作为资源控制器在实例化时必然涉及资源初始化，而这很有可能耗费时间。这意味着出现很多线程同时首次引用此类的几率变得较大。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-9
 */
public class LazySingleton {
	
	private static LazySingleton instance;

	/**
	 * 和饿汉式一样私有的构造方法
	 */
	private LazySingleton() {
	}

	/**
	 * 静态工厂方法返回唯一的实例，synchronized是为了处理多线程环境。
	 */
	public synchronized static LazySingleton getInstance() {
		// 只有第一次调用该方法时才会创建唯一的实例
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}