/**
 * 
 */
package pattern.Composite.transparent;

import java.util.List;

/**
 * ��Ҷ����(Leaf)��ɫ
 * <p>
 * ����μ���ϵ���Ҷ���󣬶�����μ���ϵ�ԭʼ�������Ϊ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-11
 */
public class Leaf implements Component {

	@Override
	public void operation() {
		System.out.println("Leaf operation.");
	}

	/** ���������������ķ�����ƽӹʵ�� */
	
	@Override
	public void add(Component component) {
		// do nothing
	}

	@Override
	public List<Component> getComponents() {
		return null;
	}

	@Override
	public void remove(Component component) {
		// do nothing
	}
}