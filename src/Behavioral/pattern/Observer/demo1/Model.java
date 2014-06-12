/**
 * 
 */
package pattern.Observer.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * ģ����
 * <p>
 * ���۲��߽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-10
 */
public abstract class Model {

	private List<View> views;// ��ͼ�б�

	protected List<View> getViews() {
		if (views == null) {
			views = new ArrayList<View>();
		}
		return views;
	}

	/**
	 * ���һ����ͼ
	 */
	public void addView(View view) {
		getViews().add(view);
	}

	/**
	 * ɾ��ָ����ͼ
	 */
	public void removeView(View view) {
		getViews().remove(view);
	}

	/**
	 * ֪ͨ������ͼ�����Լ�
	 */
	public void notifyViews() {
		for (View view : getViews()) {
			view.update(this);
		}
	}
}