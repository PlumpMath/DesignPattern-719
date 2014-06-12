/**
 * 
 */
package pattern.Singleton.more;

/**
 * 5���ڲ�������ʽ����
 * <p>
 * ����ʱ�����ʼ����̬����INSTANCE����Ϊû������ʹ�ã��ﵽ�����ء�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014-6-6
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
