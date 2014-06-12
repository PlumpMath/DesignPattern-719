/**
 * 
 */
package pattern.Singleton.more;

/**
 * 1������ʽ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014-6-6
 */
public final class HungrySingleton {

	private static final HungrySingleton INSTANCE = new HungrySingleton();

	private HungrySingleton() {
		super();
		System.out.println("instance created");
	}

	public static HungrySingleton getInstance() {
		return INSTANCE;
	}
	
	public static void method(){}
}
