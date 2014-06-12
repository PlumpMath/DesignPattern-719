/**
 * 
 */
package pattern.Memento.boxblack;

/**
 * �ͻ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-7-14
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		Originator originator = new Originator();
		originator.setState("ON");
		// �����˴���һ����ǰ״̬�ı���¼���������˱���
		caretaker.saveMemento(originator.createMemento());
		originator.setState("OFF");
		// �����˴Ӹ���������ȡ�ر���¼���󲢾ݴ˻ָ�״̬
		originator.restoreMemento(caretaker.retrieveMemento());
	}
}