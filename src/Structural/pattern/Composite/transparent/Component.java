/**
 * 
 */
package pattern.Composite.transparent;

import java.util.List;

/**
 * ���󹹼�(Component)��ɫ
 * <p>
 * ����һ�������ɫ�������μ���ϵĶ�����������Ľӿڼ���Ĭ����Ϊ��
 * ����ӿڿ��������������е��Ӷ���Ҫ�ṩһ���ӿ��Թ淶ȡ�ú͹����²㹹����
 * ����add()��remove()�Լ�getChild()֮��ķ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-11
 */
public interface Component {

	/**
	 * ʾ������
	 */
	public void operation();
	
	/**
	 * ����һ������
	 */
	public void add(Component component);
	
	/**
	 * ɾ��ָ������
	 */
	public void remove(Component component);
	
	/**
	 * �������еĹ���
	 */
	public List<Component> getComponents();
}