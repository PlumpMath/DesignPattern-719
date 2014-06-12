/**
 * 
 */
package pattern.Memento.more;

import pattern.Memento.boxblack.IMemento;
import pattern.Memento.boxblack.Originator;

/**
 * ��ǿ������ʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-7-15
 */
public class EnhanciveCaretakerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Originator originator = new Originator();
		EnhanciveCaretaker caretaker = new EnhanciveCaretaker(originator);
		originator.setState("ON");
		// ��ǿ������Ϊ�����˴���һ����ǰ״̬�ı���¼ 
		caretaker.createMemento();
		originator.setState("OFF");
		// ��ǿ������ʹ�ñ���¼����ָ�������״̬
		caretaker.restoreMemento();
	}
}

/**
 * ��ǿ�����˽�ɫ
 * <p>
 * �ø����˽�ɫ���ñ���¼��ɫ�ͷ����˽�ɫ�����б���¼�����͸��ݱ���¼�ָ�������״̬
 * ��ô�ͻ��˱㲻����ҪЭ������¼��ɫ�ͷ����˽�ɫ����ֻ��Ҫ���ø����˽�ɫ����
 * Ҫ������һ�㣬�����˽�ɫ�ͱ������һ���Է����˽�ɫ������
 */
class EnhanciveCaretaker {

	private Originator originator;// ������

	private IMemento memento;// ����¼

	/**
	 * @param originator
	 *            ������
	 */
	public EnhanciveCaretaker(Originator originator) {
		this.originator = originator;
	}

	/**
	 * ����һ��Originator����ǰ״̬�ı���¼
	 */
	public void createMemento() {
		this.memento = originator.createMemento();
	}

	/**
	 * ���ݱ���¼�ָ�Originator�����״̬
	 */
	public void restoreMemento() {
		originator.restoreMemento(memento);
	}
}