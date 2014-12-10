/**
 * 
 */
package pattern.Observer;

/**
 * 具体观察者(Concrete Observer)角色
 * <p>
 * 存储与主题的状态相关的状态，实现抽象观察者角色所要求的更新接口，以便使自身的状态与主题的状态相协调。
 * 如果需要，具体观察者角色可以保存一个指向具体主题对象的引用。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-10
 */
public class ConcreteObserver implements Observer {

	/**
	 * 更新自己
	 * 
	 * @see pattern.Observer.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("I'm notified.");
	}
}