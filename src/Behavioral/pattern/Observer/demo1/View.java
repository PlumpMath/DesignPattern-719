/**
 * 
 */
package pattern.Observer.demo1;

/**
 * 视图接口
 * <p>
 * 观察者角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-10
 */
public interface View {

	/**
	 * 根据Model更新自己
	 * <p>
	 * 被观察者在通知观察者更新自己的时候，可以以参数的方式
	 * 将被观察者对象传递给观察者对象，使其有足够的信息做更新操作
	 * 
	 * @param model
	 *            监听的模型
	 */
	public void update(Model model);
}
