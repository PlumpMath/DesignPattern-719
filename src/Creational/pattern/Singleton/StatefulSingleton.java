/**
 * 
 */
package pattern.Singleton;

/**
 * 有状态的单例类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-10
 */
public class StatefulSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(SerialNumberGenerator.getInstance().getSerialNumber());
		System.out.println(SerialNumberGenerator.getInstance().getSerialNumber());
		System.out.println(SerialNumberGenerator.getInstance().getSerialNumber());
		SerialNumberGenerator.getInstance().resetSerialNumber(0);
		System.out.println(SerialNumberGenerator.getInstance().getSerialNumber());
		System.out.println(SerialNumberGenerator.getInstance().getSerialNumber());
		System.out.println(SerialNumberGenerator.getInstance().getSerialNumber());
	}
}

/**
 * 序列号生成器
 * <p>
 * 一个单例类可以是有状态的(stateful)，一个有状态的单例对象一般也是可变(mutable)单例对象。
 * 有状态的可变的单例对象往往当做状态库使用，
 * 比如一个单例对象持有一个int型的属性，用来给一个系统提供一个数值惟一的序列号码。
 * 当然一个单例类可以持有一个聚集，从而允许存储多个状态。
 * <p>
 * 另一方面，单例类也可以是没有状态的(stateless)，仅用作提供工具性函数的对象。
 * 既然是为了提供工具性函数，就没有必要创建多个实例，因此使用单例模式很合适。
 * 一个没有状态的单例对象一般也是不变(immutable)单例对象。
 * <p>
 * 因为单例类是局限于某一个JVM中的，所以在任何使用了EJB、RMI和JINI技术的分布式系统中(多JVM)，
 * 应当避免使用有状态的单例类。同样对于同一个JVM中的多个类加载器，当它们加载同一个类时，会出现多个实例，
 * 也就是说经由不同的类加载器加载的对象之间是绝缘的，所以在这种情况下也应当避免使用有状态的单例类。
 */
class SerialNumberGenerator {

	private static final SerialNumberGenerator INSTANCE = new SerialNumberGenerator();

	private int serialNumber = 0;// 序列号

	private SerialNumberGenerator() {
	}

	public static SerialNumberGenerator getInstance() {
		return INSTANCE;
	}

	public synchronized int getSerialNumber() {
		return ++serialNumber;
	}

	public synchronized void resetSerialNumber(int number) {
		this.serialNumber = number;
	}
}