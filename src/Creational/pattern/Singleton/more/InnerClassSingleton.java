/**
 * 
 */
package pattern.Singleton.more;

/**
 * 5，内部类懒汉式单例
 * <p>
 * 加载时不会初始化静态变量INSTANCE，因为没有主动使用，达到懒加载。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014-6-6
 */
public final class InnerClassSingleton {

	private static final class SingletonHolder {
		
		private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
	}
	
	private InnerClassSingleton() {
		super();
		System.out.println("instance created");
	}

	public static InnerClassSingleton getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
