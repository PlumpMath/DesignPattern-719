/**
 * 
 */
package pattern.Facade;

/**
 * ����(Facade)��ɫ
 * <p>
 * �ͻ��˿��Ե��������ɫ�ķ������˽�ɫ֪����ص�(һ�����߶��)��ϵͳ�Ĺ��ܺ����Ρ�
 * ����������£�����ɫ�Ὣ���дӿͻ��˷���������ί�ɵ���Ӧ����ϵͳȥ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-25
 */
public class Facade {
	
	// ������ģʽ�У�ͨ��ֻ��Ҫ�������һ��ʵ��(����ģʽ)
	private static Facade singleton = new Facade();

	// ������֪��������ϵͳ������ְ��͹���
	private SubSystem1 subsystem1 = new SubSystem1();
	private SubSystem2 subsystem2 = new SubSystem2();
	private SubSystemN subsystemN = new SubSystemN();

	private Facade() {
		// do nothing
	}

	/**
	 * ����
	 */
	public static Facade getInstance() {
		return singleton;
	}

	/**
	 * �Կͻ����ṩ�ĵĸ߲�ӿ�
	 */
	public void operationAll() {
		// ί�ɸ�������ϵͳ������ز���
		subsystem1.operation1();
		subsystem2.operation2();
		subsystemN.operationN();
	}
}