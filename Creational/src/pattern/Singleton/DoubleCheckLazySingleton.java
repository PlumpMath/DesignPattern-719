/**
 * 
 */
package pattern.Singleton;

/**
 * 双重检查懒汉式单例类
 * <p>
 * 双重检查不适用于1.4及更早版本的JDK。
 * 在一般情况下，使用饿汉式单例模式或者对整个静态工厂方法同步化的懒汉式单例模式足以解决在实际设计工作中遇到的问题。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-9
 */
public class DoubleCheckLazySingleton {

	// 注意这里的 volatile 关键字
	private volatile static DoubleCheckLazySingleton INSTANCE;

	private DoubleCheckLazySingleton() {
	}

	/**
	 * 由于懒汉式单例类的getInstance()方法只有在第一次被调用时才会创建唯一实例，而在整个方法上加 synchronized 
	 * 会使得该方法每次被调用都会有并发方面的开销，使用双重检查加锁方式可以优化效率，如下所示：
	 * 
	 * 这样只有在getInstance()第一次被调用时才会有并发方面的开销，一旦唯一实例被创建出来之后就不会再有并发方面的开销。
	 */
	public static DoubleCheckLazySingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (DoubleCheckLazySingleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new DoubleCheckLazySingleton();
				}
			}
		}
		return INSTANCE;
	}
}
