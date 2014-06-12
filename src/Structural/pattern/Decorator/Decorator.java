/**
 * 
 */
package pattern.Decorator;

/**
 * װ�ν�ɫ
 * <p>
 * ����һ������(Component)�����ʵ����������һ������󹹼��ӿ�һ�µĽӿڡ�
 * <p>
 * ע��һ��װ����Ľӿڱ����뱻װ����Ľӿ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-13
 */
public abstract class Decorator implements Component {// 1����Ҫʵ�ֹ���(Component)�ӿ�

	// 2������һ�����ԣ��������ǹ���(Component)
	private Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	protected Component getComponent() {
		return component;
	}
}