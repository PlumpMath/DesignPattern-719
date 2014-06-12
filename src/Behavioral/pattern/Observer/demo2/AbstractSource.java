/**
 * 
 */
package pattern.Observer.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * Դ�ĳ������
 * <p>
 * ���󱻹۲��߽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-10
 */
public abstract class AbstractSource implements Source{
	
	private List<Listener> listeners;// �������б�

	protected List<Listener> getListeners() {
		if (listeners == null) {
			listeners = new ArrayList<Listener>();
		}
		return listeners;
	}

	public void addListener(Listener l) {
		getListeners().add(l);
	}

	public void removeListener(Listener l) {
		getListeners().remove(l);
	}

	/**
	 * ���¼�֪ͨ���еļ�������������ִ����ض���
	 *
	 * @see pattern.Observer.demo2.Source#fireEvent(pattern.Observer.demo2.Event)
	 */
	public void fireEvent(Event event) {
		for (Listener listener : getListeners()) {
			listener.doAction(event);
		}
	}
}