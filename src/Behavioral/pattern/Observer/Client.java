/**
 * 
 */
package pattern.Observer;

/**
 * �ͻ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-10
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �ͻ��˳����𴴽����ֶ�����װ����
		ConcreteSubject subject = new ConcreteSubject();
		subject.addObserver(new ConcreteObserver());
		subject.addObserver(new ConcreteObserver());
		subject.setState("new state");
	}
}