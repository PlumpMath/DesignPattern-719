/**
 * 
 */
package pattern.Memento.boxblack;

/**
 * ������(Caretaker)��ɫ
 * <p>
 * 1�����𱣴汸��¼����
 * 2������鱸��¼��������ݡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-7-14
 */
public class Caretaker {

	private IMemento memento;// ����¼����

	/**
	 * ȡ�ر���¼
	 */
	public IMemento retrieveMemento() {
		return memento;
	}

	/**
	 * ���汸��¼
	 */
	public void saveMemento(IMemento memento) {
		this.memento = memento;
	}
}