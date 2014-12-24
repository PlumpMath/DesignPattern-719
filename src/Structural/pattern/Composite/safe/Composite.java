/**
 * 
 */
package pattern.Composite.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * ��֦����(Composite)��ɫ
 * <p>
 * ����μ���ϵ����¼��Ӷ���Ķ�����֦��������й����Ӷ���ķ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-11
 */
public class Composite implements Component {

	private List<Component> components;

	@Override
	public void operation() {
		// �������еĹ�������ִ��operation()����
		for (Component component : getComponents()) {
			component.operation();
		}
	}

	/** ����Ϊ�����Ӷ���ķ��� */
	
	/**
	 * ����һ������
	 */
	public void add(Component component) {
		getComponents().add(component);
	}

	/**
	 * ɾ��ָ������
	 */
	public void remove(Component component) {
		getComponents().remove(component);
	}

	/**
	 * �������еĹ���
	 */
	public List<Component> getComponents() {
		if (components == null) {
			components = new ArrayList<Component>();
		}
		return components;
	}
}