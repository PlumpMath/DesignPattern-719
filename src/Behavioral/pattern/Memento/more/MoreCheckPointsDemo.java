/**
 * 
 */
package pattern.Memento.more;

import java.util.HashMap;
import java.util.Map;

/**
 * �������ʾ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-7-16
 */
public class MoreCheckPointsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker(originator);
		originator.setState1("1");
		originator.setState2("a");
		caretaker.createCheckPoint("1st");// ��1������
		originator.setState1("2");
		originator.setState2("b");
		caretaker.createCheckPoint("2nd");// ��2������
		originator.setState1("3");
		originator.setState2("c");
		caretaker.createCheckPoint("3rd");// ��3������
		originator.setState1("4");
		originator.setState2("d");
		caretaker.createCheckPoint("4th");// ��4������
		caretaker.restoreCheckPoint("1st");// �ָ�����1�������״̬
	}
}

/**
 * ��ǿ�����˽�ɫ
 * <p>
 * ���������ϵͳ������Ҫ�洢��ֹһ��ʱ�̵�״̬
 * ������Ҫ�洢���ʱ�̵�״̬�����߽����������
 * ���������˾Ϳ��Խ��Լ��ָ����κ�һ��ʱ�̵�״̬
 * ��Щʵ��������������洢���޸�״̬����Щֻ����洢���޸�״̬
 */
class Caretaker {

	// ʹ��һ��Map���洢��ͬʱ�̵ı���¼�������������޸�
	private Map<String, Memento> checkpoint_memento_map;

	private Originator originator;

	public Caretaker(Originator originator) {
		this.originator = originator;
	}

	/**
	 * ��ָ���ؼ��ֵĴ���һ������
	 */
	public void createCheckPoint(String key) {
		getMap().put(key, originator.createMemento());
	}

	/**
	 * ɾ��ָ���ؼ��ֶ�Ӧ�ļ���
	 */
	public void removeCheckPoint(String key) {
		getMap().remove(key);
	}

	/**
	 * �ָ������˵�ָ���ؼ��ֶ�Ӧ�ļ����״̬
	 */
	public void restoreCheckPoint(String key) {
		originator.restoreMemento(getMap().get(key));
	}

	private Map<String, Memento> getMap() {
		if (checkpoint_memento_map == null) {
			checkpoint_memento_map = new HashMap<String, Memento>();
		}
		return checkpoint_memento_map;
	}
}

class Originator {

	// ����״̬
	private String state1;
	private String state2;

	public Memento createMemento() {
		System.out.println("state1=" + state1 + "  state2=" + state2);
		return new Memento(state1, state2);
	}

	public void restoreMemento(Memento memento) {
		setState1(memento.getState1());
		setState2(memento.getState2());
		System.out.println("state1=" + state1 + "  state2=" + state2);
	}

	public String getState1() {
		return state1;
	}

	public void setState1(String state1) {
		this.state1 = state1;
	}

	public String getState2() {
		return state2;
	}

	public void setState2(String state2) {
		this.state2 = state2;
	}
}

class Memento {

	private String state1;
	private String state2;

	public Memento(String state1, String state2) {
		this.state1 = state1;
		this.state2 = state2;
	}

	public String getState1() {
		return state1;
	}

	public String getState2() {
		return state2;
	}
}