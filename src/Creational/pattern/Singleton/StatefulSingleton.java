/**
 * 
 */
package pattern.Singleton;

/**
 * ��״̬�ĵ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-10
 */
public class StatefulSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(SerialNumberGenerator.getInstance().getSerialNumber());
		System.out.println(SerialNumberGenerator.getInstance().getSerialNumber());
		System.out.println(SerialNumberGenerator.getInstance().getSerialNumber());
		SerialNumberGenerator.getInstance().resetSerialNumber(0);
		System.out.println(SerialNumberGenerator.getInstance().getSerialNumber());
		System.out.println(SerialNumberGenerator.getInstance().getSerialNumber());
		System.out.println(SerialNumberGenerator.getInstance().getSerialNumber());
	}
}

/**
 * ���к�������
 * <p>
 * һ���������������״̬��(stateful)��һ����״̬�ĵ�������һ��Ҳ�ǿɱ�(mutable)��������
 * ��״̬�Ŀɱ�ĵ���������������״̬��ʹ�ã�
 * ����һ�������������һ��int�͵����ԣ�������һ��ϵͳ�ṩһ����ֵΩһ�����к��롣
 * ��Ȼһ����������Գ���һ���ۼ����Ӷ�����洢���״̬��
 * <p>
 * ��һ���棬������Ҳ������û��״̬��(stateless)���������ṩ�����Ժ����Ķ���
 * ��Ȼ��Ϊ���ṩ�����Ժ�������û�б�Ҫ�������ʵ�������ʹ�õ���ģʽ�ܺ��ʡ�
 * һ��û��״̬�ĵ�������һ��Ҳ�ǲ���(immutable)��������
 * <p>
 * ��Ϊ�������Ǿ�����ĳһ��JVM�еģ��������κ�ʹ����EJB��RMI��JINI�����ķֲ�ʽϵͳ��(��JVM)��
 * Ӧ������ʹ����״̬�ĵ����ࡣͬ������ͬһ��JVM�еĶ����������������Ǽ���ͬһ����ʱ������ֶ��ʵ����
 * Ҳ����˵���ɲ�ͬ������������صĶ���֮���Ǿ�Ե�ģ����������������ҲӦ������ʹ����״̬�ĵ����ࡣ
 */
class SerialNumberGenerator {

	private static final SerialNumberGenerator INSTANCE = new SerialNumberGenerator();

	private int serialNumber = 0;// ���к�

	private SerialNumberGenerator() {
	}

	public static SerialNumberGenerator getInstance() {
		return INSTANCE;
	}

	public synchronized int getSerialNumber() {
		return ++serialNumber;
	}

	public synchronized void resetSerialNumber(int number) {
		this.serialNumber = number;
	}
}