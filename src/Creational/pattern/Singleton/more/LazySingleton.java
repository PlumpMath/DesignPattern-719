/**
 * 
 */
package pattern.Singleton.more;

/**
 * 2����ͳ����ʽ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014-6-6
 */
public final class LazySingleton {

	private static LazySingleton instance;

	private LazySingleton() {
		super();
		System.out.println("instance created");
	}

	/**
	 * ��ʹ�� synchronized ���޷���֤Ψһ������
	 * ��ʹ�� synchronized �����Ч���ϵ���ʧ��
	 */
	public synchronized static LazySingleton getInstance() {
		if(instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
