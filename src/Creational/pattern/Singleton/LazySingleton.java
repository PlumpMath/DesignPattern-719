/**
 * 
 */
package pattern.Singleton;

/**
 * ����ʽ������
 * <p>
 * ���౻����ʱ���ᴴ��Ψһ��ʵ����ֻ��ʹ�ø�ʵ����ʱ������ᱻ����������������ʽ
 * <p>
 * �Ͷ���ʽ������ıȽϣ�
 * ����ʽ���������౻����ʱ�ͻᴴ��Ψһ��ʵ����
 * ������Դ����Ч�ʵĽǶȽ������������ʽ�������Բ�Щ��
 * ���ٶȺͷ�Ӧʱ��ǶȽ����������ʽ�������Ժ�Щ��
 * Ȼ������ʽ��������ʵ����ʱ���봦�����ڶ���߳�ͬʱ�״�����ʵ��ʱ�ķ�����������
 * �ر��ǵ���������Ϊ��Դ��������ʵ����ʱ��Ȼ�漰��Դ��ʼ����������п��ܺķ�ʱ��
 * ����ζ�ų��ֺܶ��߳�ͬʱ�״����ô���ļ��ʱ�ýϴ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-9
 */
public class LazySingleton {
	
	private static LazySingleton instance;

	/**
	 * �Ͷ���ʽһ��˽�еĹ��췽��
	 */
	private LazySingleton() {
	}

	/**
	 * ��̬������������Ψһ��ʵ��
	 * synchronized��Ϊ�˴������̻߳���
	 */
	public synchronized static LazySingleton getInstance() {
		// ֻ�е�һ�ε��ø÷���ʱ�Żᴴ��Ψһ��ʵ��
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}