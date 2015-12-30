/**
 * 
 */
package pattern.Singleton.more;

/**
 * 4，枚举单例
 * <p>
 * 不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 * 但是这种实现方式是利用Java自身特性实现的，不具有普遍性。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014-6-6
 */
public enum EnumSingleton {

	INSTANCE;

	private EnumSingleton() {
		System.out.println("instance created");
	}
}
