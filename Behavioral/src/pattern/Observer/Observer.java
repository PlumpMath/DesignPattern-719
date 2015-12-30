/**
 * 
 */
package pattern.Observer;

/**
 * 抽象观察者(Observer)角色
 * <p>
 * 为所有的具体观察者定义一个接口，在得到主题的通知时更新自己。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-10
 */
public interface Observer {

	/**
	 * 更新自己
	 */
	public void update();
}
