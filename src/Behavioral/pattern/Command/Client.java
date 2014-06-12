/**
 * 
 */
package pattern.Command;

/**
 * �ͻ�(Client)��ɫ
 * <p>
 * ������������(ConcreteCommand)����ȷ��������ߡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-4
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker(command);
		invoker.executeCommand();
	}
}