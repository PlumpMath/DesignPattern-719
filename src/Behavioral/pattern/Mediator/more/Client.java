/**
 * 
 */
package pattern.Mediator.more;

/**
 * �ͻ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-9
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClolleagueManager manager = new ClolleagueManager();
		manager.colleague1Action();
		manager.colleague2Action();
		manager.colleague1Changed();
		manager.colleague2Changed();
	}
}