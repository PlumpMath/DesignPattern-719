/**
 * 
 */
package pattern.Observer.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 模型类
 * <p>
 * 被观察者角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-10
 */
public abstract class Model {

	private List<View> views;// 视图列表

	protected List<View> getViews() {
		if (views == null) {
			views = new ArrayList<View>();
		}
		return views;
	}

	/**
	 * 添加一个视图
	 */
	public void addView(View view) {
		getViews().add(view);
	}

	/**
	 * 删除指定视图
	 */
	public void removeView(View view) {
		getViews().remove(view);
	}

	/**
	 * 通知所有视图更新自己
	 */
	public void notifyViews() {
		for (View view : getViews()) {
			view.update(this);
		}
	}
}