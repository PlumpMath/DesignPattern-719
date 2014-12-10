/**
 * 
 */
package pattern.Observer;

/**
 * 具体主题(ConcreteSubject)角色
 * <p>
 * 将相关状态存入具体主题对象，在具体主题的内部状态改变时，给所有登记过的观察者发出通知。
 * 具体主题角色又叫做具体被观察者角色(Concrete Observable)。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-10
 */
public class ConcreteSubject extends Subject {

	private String state;// 内部状态
	
	public String getState() {
		return state;
	}

	/**
	 * 修改状态
	 */
	public void setState(String state) {
		this.state = state;
		// 状态变化了，通知所有的观察者
		notifyObservers();
	}
}