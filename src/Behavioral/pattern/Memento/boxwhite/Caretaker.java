/**
 * 
 */
package pattern.Memento.boxwhite;

/**
 * ������(Caretaker)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-7-14
 */
public class Caretaker {

	private Memento memento;// ����¼����

	/**
	 * ȡ�ر���¼
	 */
	public Memento retrieveMemento() {
		return memento;
	}

	/**
	 * ���汸��¼
	 */
	public void saveMemento(Memento memento) {
		this.memento = memento;
	}
}