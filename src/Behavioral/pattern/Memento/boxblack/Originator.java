/**
 * 
 */
package pattern.Memento.boxblack;

/**
 * ������(Originator)��ɫ
 * <p>
 * 1������һ�������䵱ǰ�ڲ�״̬�ı���¼����
 * 2��ʹ�ñ���¼����ָ����ڲ�״̬��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-7-14
 */
public class Originator {

	private String state;// ״̬

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
	public IMemento createMemento() {
		return new Memento(this.getState());
	}

	/**
	 * ���ݱ���¼�ָ���״̬
	 */
	public void restoreMemento(IMemento memento) {
		this.setState(((Memento) memento).getState());
	}
	
	
	/**
	 * ����¼(Memento)��ɫ
	 * <p>
	 * 1���������˶�����ڲ�״̬�洢������
	 * 2������¼���Ա��������ݲ��������˶���֮����κζ�������ȡ��
	 * <p>
	 * ����¼��������Ч�Ľӿڣ�</br>
	 * <li>խ�ӿ�(narrow interface)��</br>
	 * �����˶���(�������������˶���֮����κζ���)�������Ǳ���¼��խ�ӿڣ����խ�ӿ�ֻ�������ѱ���¼���󴫸������Ķ���
	 * <li>��ӿ�(wide interface)��</br>
	 * �븺���˶��󿴵���խ�ӿ��෴���ǣ������˶�����Կ���һ����ӿڣ�
	 * �����ӿ���������ȡ���е����ݣ��Ա������Щ���ݻָ���������˶�����ڲ�״̬��
	 */
	private static class Memento implements IMemento {

		private String state;// ������״̬

		private Memento(String state) {
			this.state = state;
		}

		/**
		 * private���η��ʷ�����ֻ֤��Originator������Զ�ȡ������
		 */
		private String getState() {
			return state;
		}
	}
}