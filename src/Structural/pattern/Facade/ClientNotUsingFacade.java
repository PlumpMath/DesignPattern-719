/**
 * 
 */
package pattern.Facade;

/**
 * û��ʹ������ģʽʱ�Ŀͻ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-25
 */
public class ClientNotUsingFacade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ���һ��������Ҫ�Ͷ����ϵͳ����򽻵�
		SubSystem1 subsystem1 = new SubSystem1();
		subsystem1.operation1();
		SubSystem2 subsystem2 = new SubSystem2();
		subsystem2.operation2();
		SubSystemN subsystemN = new SubSystemN();
		subsystemN.operationN();
	}
}