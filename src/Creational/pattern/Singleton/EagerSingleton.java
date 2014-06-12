/**
 * 
 */
package pattern.Singleton;

/**
 * 饿汉式单例类
 * <p>
 * 当类被加载时就会创建唯一的实例，所以是饿汉式
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-9
 */
public class EagerSingleton {

	// 当类被加载时静态变量 INSTANCE 会被初始化，类的私有构造子会被调用，
	// 此时单例类的的惟一实例就被创建出来了
	private static final EagerSingleton INSTANCE = new EagerSingleton();

	/**
	 * 单例类的重要特点是构造方法是私有的
	 * 从而避免外界利用构造方法直接创建出任意多的实例
	 * 另外由于是私有的，所以此类不能被继承
	 */
	private EagerSingleton() {
	}

	/**
	 * 静态工厂方法返回唯一的实例(单例模式使用了简单工厂模式)
	 */
	public static EagerSingleton getInstance() {
		return INSTANCE;
	}
}