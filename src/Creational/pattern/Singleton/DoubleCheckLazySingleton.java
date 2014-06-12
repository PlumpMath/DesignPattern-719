/**
 * 
 */
package pattern.Singleton;

/**
 * 双重检查懒汉式单例类
 * <p>
 * 一般而言，双重检查成例无法在现有的Java语言编译器里工作。
 * 在一般情况下，使用饿汉式单例模式或者对整个静态工厂方法同步化的
 * 懒汉式单例模式足以解决在实际设计工作中遇到的问题
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-9
 */
public class DoubleCheckLazySingleton {

	private static DoubleCheckLazySingleton INSTANCE;

	private DoubleCheckLazySingleton() {
	}

	/**
	 * 由于懒汉式单例类的getInstance()方法只有在第一次被调用时才会创建唯一实例
	 * 而在整个方法上加 synchronized 会使得该方法每次被调用都会有并发方面的开销
	 * 使用双重检查成例方式可以优化效率，如下所示：
	 * 这样只有在getInstance()第一次被调用时才会有并发方面的开销，
	 * 一旦唯一实例被创建出来之后就不会再有并发方面的开销了
	 * <p>
	 * 双重检查的成例方式在代码层面上看没有任何问题，完全符合逻辑
	 * 在Java中双重检查不成立并不是JVM的实现问题，而是因为Java平台的内存模型(memory model)
	 * 目前Java的内存模型会将
	 * INSTANCE = new DoubleCheckLazySingleton();
	 * 解释为下面的几行代码：
	 * M1. mem = allocate();// 分配内存
	 * M2. instance = mem;// 将内存分配给单例对象，此时单例对象已经不是null
	 * M3. constructSingleton(instance);// 调用构造方法初始化单例对象
	 * <p>
	 * 这样的话，如果有一个线程A第一次调用getInstance()方法
	 * 方法执行到2，此时 INSTANCE 是null，于是进入到3开始创建实例
	 * 按照上面Java内存模型的处理方式，方法会按照M1、M2、M3的次序顺序执行下去
	 * 如果在线程A恰好刚执行完M2的时候又一个线程B调用了getInstance()方法
	 * 此时线程B看到的 INSTANCE 实际上已经被分配了内存，不再是null了
	 * 所以线程B会直接返回 INSTANCE 对象，并且可能会调用它的某些方法
	 * 而线程A则正在执行M3，即对 INSTANCE 对象的初始化工作
	 * 如此，如果线程B在线程A没有完成对 INSTANCE 对象的初始化之前调用了它的方法就会出现异常
	 */
	public static DoubleCheckLazySingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (DoubleCheckLazySingleton.class) {// 1
				if (INSTANCE == null) {// 2
					INSTANCE = new DoubleCheckLazySingleton();// 3
				}
			}
		}
		return INSTANCE;
	}
}