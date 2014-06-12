/**
 * 
 */
package pattern.Memento.boxwhite;

/**
 * ������(Originator)��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-7-14
 */
public class Originator {

	private String state;// �ڲ�״̬

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("now state is " + state);
	}

	/**
	 * ������ǰ״̬��һ������¼
	 */
	public Memento createMemento() {
		return new Memento(this.getState());
	}

	/**
	 * ���ݱ���¼�ָ���״̬
	 */
	public void restoreMemento(Memento memento) {
		this.setState(memento.getState());
	}
}