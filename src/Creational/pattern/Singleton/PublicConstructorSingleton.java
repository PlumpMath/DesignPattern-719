/**
 * 
 */
package pattern.Singleton;

/**
 * 不完全的单例类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-9
 */
public class PublicConstructorSingleton {
	
	private static PublicConstructorSingleton instance;

	/**
	 * 公开的构造方法，外界可以直接创建出多个实例
	 * 这违背了单例类只有一个实例的特性，因此不是完全的单例类
	 * <p>
	 * 造成这种情况的原因：
	 * 1，初学者的错误
	 * 2，当初考虑不周，将一个类设计成为单例类，后来发现此类应当有多于一个的实例
	 * 浴室就将构造方法改为公开的，以便在需要多于一个的实例时，可以随时调用构造方法创建新的实例
	 * 3，有意使用一种"改良"的单例模式，这样做的唯一好处是允许客户端选择如何将类实例化
	 * 即可以创建新的自己独有的实例，或者使用共享的那个实例
	 * 由于没有任何的强制措施，客户端的选择不一定是合理的选择
	 * 这样不恰当的将选择权交给客户端必然会导致不理想的设计和实现
	 */
	public PublicConstructorSingleton() {
	}

	public synchronized static PublicConstructorSingleton getInstance() {
		if (instance == null) {
			instance = new PublicConstructorSingleton();
		}
		return instance;
	}
}