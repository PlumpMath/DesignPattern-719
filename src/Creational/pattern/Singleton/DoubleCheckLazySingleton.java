/**
 * 
 */
package pattern.Singleton;

/**
 * ˫�ؼ������ʽ������
 * <p>
 * ˫�ؼ�鲻������1.4������汾��JDK��
 * ��һ������£�ʹ�ö���ʽ����ģʽ���߶�������̬��������ͬ����������ʽ����ģʽ���Խ����ʵ����ƹ��������������⡣
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-9
 */
public class DoubleCheckLazySingleton {

	// ע������� volatile �ؼ���
	private volatile static DoubleCheckLazySingleton INSTANCE;

	private DoubleCheckLazySingleton() {
	}

	/**
	 * ��������ʽ�������getInstance()����ֻ���ڵ�һ�α�����ʱ�Żᴴ��Ψһʵ�����������������ϼ� synchronized 
	 * ��ʹ�ø÷���ÿ�α����ö����в�������Ŀ�����ʹ��˫�ؼ�������ʽ�����Ż�Ч�ʣ�������ʾ��
	 * 
	 * ����ֻ����getInstance()��һ�α�����ʱ�Ż��в�������Ŀ�����һ��Ψһʵ������������֮��Ͳ������в�������Ŀ�����
	 */
	public static DoubleCheckLazySingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (DoubleCheckLazySingleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new DoubleCheckLazySingleton();
				}
			}
		}
		return INSTANCE;
	}
}