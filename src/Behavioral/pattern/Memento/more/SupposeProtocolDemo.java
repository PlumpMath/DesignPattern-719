/**
 * 
 */
package pattern.Memento.more;

/**
 * ����Э��ģʽ��ʾ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-7-16
 */
public class SupposeProtocolDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SupposeProtocolOriginator originator = new SupposeProtocolOriginator();
		originator.setState("ON");
		System.out.println(originator);
		originator.operation1();
		System.out.println(originator);
		originator.operation2();
		System.out.println(originator);
	}
}

/**
 * �����˽�ɫ
 * <p>
 * ���θ����ˣ�ʹ�ü���Э��ģʽʵ�֣���ʵ�����Ǳ���¼ģʽ��һ������
 */
class SupposeProtocolOriginator implements Cloneable {

	private String state;// ״̬

	private Memento memento;// ����¼

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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

	/**
	 * ��ʾ����¼ģʽ�Ĳ�������
	 * <p>
	 * 1������һ������¼����
	 * 2��ִ��ĳ����������������ǿ��Գ����ģ�
	 * 3������������״̬����Ч�ԣ������ɶ����Լ��ڲ���飬Ҳ������ĳ���ⲿ������м�飻
	 * 4�������Ҫ�Ļ���������������Ҳ���Ǹ��ݱ���¼���󽫷����˶����״̬�ָ�������
	 * <p>
	 * �ȱ��ݣ���ȥ��������ʧ����֮��ʹ�ñ��ݽ���״̬�ָ�
	 */
	public void operation1() {
		try {
			createMemento();
			// do something and this.state changed then Exception occured
			setState("Unkown");
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("Exception occured.");
			restoreMemento();
		}
	}

	/**
	 * ����Э��ģʽ�Ĳ�������
	 * <p>
	 * 1���������˶�����п�¡������һ��������
	 * 2���ڿ�����ִ��ĳ��������
	 * 3����鿽����������״̬����Ч�ԣ������ɶ����Լ��ڲ���飬Ҳ������ĳ���ⲿ������м�飻
	 * 4��������������Ч�ģ���ô���ӵ���������������쳣�������������������Ч�ģ�����ԭ������ִ�����������
	 * <p>
	 * �ȿ�¡����ʹ�ÿ�¡����ȥ��������ʧ���˾��ӵ���¡����һ�㶼��Ӱ��ԭ���󣬳ɹ�������ʹ��ԭ����ȥ��������
	 * <p>
	 * ����ڳ���һ���������ָ�����ǰ״̬��Ϊ���Ӻ����ѵķ����˶�����˵����һ��������Ч��������
	 * �����ŵ��ǿ��Ա�֤�����˶�����Զ���ᴦ����Ч״̬��
	 * ����ȱ���ǳɹ��Ĳ�������ִ�����Σ���������ĳɹ��ʽϵ͵Ļ������������Ƚϻ��㡣
	 * ע�⣺����Щ����£�������ԭ������й�������ݣ���ʱ�������޸Ŀ�������ԭ���󶼻ᵼ�����ݱ��޸ġ�
	 */
	public void operation2() {
		try {
			SupposeProtocolOriginator clone = (SupposeProtocolOriginator) clone();
			// do something and clone.state changed then Exception occured
			clone.setState("Unkown");
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("Exception occured.");
		}
		// redo something for this -- the real object
	}

	/**
	 * ��¡ʵ����Ҳ�Ǳ���¼��һ��
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String toString() {
		return "state = " + getState();
	}

	private static class Memento {

		private String state;// ������״̬

		private Memento(String state) {
			this.state = state;
		}

		private String getState() {
			return state;
		}
	}
}