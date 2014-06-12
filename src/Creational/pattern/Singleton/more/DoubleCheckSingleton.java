/**
 * 
 */
package pattern.Singleton.more;

/**
 * 3��˫��У������ʽ����
 * <p>
 * ���ַ�ʽ�ڵ�ǰJava���ڴ�ģ��������Ч�ġ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014-6-6
 */
public final class DoubleCheckSingleton {

	private static DoubleCheckSingleton instance;

	private DoubleCheckSingleton() {
		super();
		System.out.println("instance created");
	}

	public static DoubleCheckSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}
}
