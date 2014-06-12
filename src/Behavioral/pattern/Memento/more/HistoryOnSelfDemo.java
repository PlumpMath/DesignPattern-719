/**
 * 
 */
package pattern.Memento.more;

/**
 * ������ʷģʽ��ʾ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-7-16
 */
public class HistoryOnSelfDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HistoryOnSelfOriginator originator = new HistoryOnSelfOriginator();
		originator.setState("ON");
		originator.createMemento();// ����һ�ݱ���¼
		originator.setState("OFF");
		originator.restoreMemento();// ���ݱ���¼�ָ�״̬
	}
}

/**
 * ����¼(խ)�ӿ�
 */
interface IMemento {
}

/**
 * ������ʷģʽ�з����˽�ɫ�Լ����θ����˽�ɫ
 * <p>
 * ����������ʷ��Ϊһ������¼ģʽ������ʵ����ʽ�ǳ����׶�
 * �������Ǳ���¼ģʽ��Ϊ���е�ʵ����ʽ��
 * ����ͨ���ɶ��������˽�ɫ��ʵ�֣����ϵͳ���ж�������˽�ɫ�Ļ�
 * ��Щ�����˽�ɫ���Թ���ͬһ�������˽�ɫ�������ڶ�̬��ǰ����ʹ�ö��������������
 * û�ж����ĸ����˽�ɫ��������ʷʵ���޷�������һ��
 * ��Ϊÿһ�������˶��Լ����θ����ˣ��޷��������빲����������ʵ�ֵ�ȱ������ֳ�����
 */
class HistoryOnSelfOriginator {

	private String state;// ״̬
	
	private Memento memento;// ����¼

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
	public void createMemento() {
		this.memento = new Memento(this.getState());
	}

	/**
	 * ���ݱ���¼�ָ���״̬
	 */
	public void restoreMemento() {
		this.setState(memento.getState());
	}

	private static class Memento implements IMemento {

		private String state;// ������״̬

		private Memento(String state) {
			this.state = state;
		}

		private String getState() {
			return state;
		}
	}
}