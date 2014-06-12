/**
 * 
 */
package pattern.Singleton;

/**
 * ����ʽ������
 * <p>
 * ���౻����ʱ�ͻᴴ��Ψһ��ʵ���������Ƕ���ʽ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-9
 */
public class EagerSingleton {

	// ���౻����ʱ��̬���� INSTANCE �ᱻ��ʼ�������˽�й����ӻᱻ���ã�
	// ��ʱ������ĵ�Ωһʵ���ͱ�����������
	private static final EagerSingleton INSTANCE = new EagerSingleton();

	/**
	 * ���������Ҫ�ص��ǹ��췽����˽�е�
	 * �Ӷ�����������ù��췽��ֱ�Ӵ�����������ʵ��
	 * ����������˽�еģ����Դ��಻�ܱ��̳�
	 */
	private EagerSingleton() {
	}

	/**
	 * ��̬������������Ψһ��ʵ��(����ģʽʹ���˼򵥹���ģʽ)
	 */
	public static EagerSingleton getInstance() {
		return INSTANCE;
	}
}