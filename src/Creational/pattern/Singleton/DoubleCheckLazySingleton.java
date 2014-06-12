/**
 * 
 */
package pattern.Singleton;

/**
 * ˫�ؼ������ʽ������
 * <p>
 * һ����ԣ�˫�ؼ������޷������е�Java���Ա������﹤����
 * ��һ������£�ʹ�ö���ʽ����ģʽ���߶�������̬��������ͬ������
 * ����ʽ����ģʽ���Խ����ʵ����ƹ���������������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-9
 */
public class DoubleCheckLazySingleton {

	private static DoubleCheckLazySingleton INSTANCE;

	private DoubleCheckLazySingleton() {
	}

	/**
	 * ��������ʽ�������getInstance()����ֻ���ڵ�һ�α�����ʱ�Żᴴ��Ψһʵ��
	 * �������������ϼ� synchronized ��ʹ�ø÷���ÿ�α����ö����в�������Ŀ���
	 * ʹ��˫�ؼ�������ʽ�����Ż�Ч�ʣ�������ʾ��
	 * ����ֻ����getInstance()��һ�α�����ʱ�Ż��в�������Ŀ�����
	 * һ��Ψһʵ������������֮��Ͳ������в�������Ŀ�����
	 * <p>
	 * ˫�ؼ��ĳ�����ʽ�ڴ�������Ͽ�û���κ����⣬��ȫ�����߼�
	 * ��Java��˫�ؼ�鲻����������JVM��ʵ�����⣬������ΪJavaƽ̨���ڴ�ģ��(memory model)
	 * ĿǰJava���ڴ�ģ�ͻὫ
	 * INSTANCE = new DoubleCheckLazySingleton();
	 * ����Ϊ����ļ��д��룺
	 * M1. mem = allocate();// �����ڴ�
	 * M2. instance = mem;// ���ڴ������������󣬴�ʱ���������Ѿ�����null
	 * M3. constructSingleton(instance);// ���ù��췽����ʼ����������
	 * <p>
	 * �����Ļ��������һ���߳�A��һ�ε���getInstance()����
	 * ����ִ�е�2����ʱ INSTANCE ��null�����ǽ��뵽3��ʼ����ʵ��
	 * ��������Java�ڴ�ģ�͵Ĵ���ʽ�������ᰴ��M1��M2��M3�Ĵ���˳��ִ����ȥ
	 * ������߳�Aǡ�ø�ִ����M2��ʱ����һ���߳�B������getInstance()����
	 * ��ʱ�߳�B������ INSTANCE ʵ�����Ѿ����������ڴ棬������null��
	 * �����߳�B��ֱ�ӷ��� INSTANCE ���󣬲��ҿ��ܻ��������ĳЩ����
	 * ���߳�A������ִ��M3������ INSTANCE ����ĳ�ʼ������
	 * ��ˣ�����߳�B���߳�Aû����ɶ� INSTANCE ����ĳ�ʼ��֮ǰ���������ķ����ͻ�����쳣
	 */
	public static DoubleCheckLazySingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (DoubleCheckLazySingleton.class) {// 1
				if (INSTANCE == null) {// 2
					INSTANCE = new DoubleCheckLazySingleton();// 3
				}
			}
		}
		return INSTANCE;
	}
}