/**
 * 
 */
package pattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题(Subject)角色
 * <p>
 * 主题角色把所有对观察者对象的引用保存在一个聚集(如List)中，每个主题都可以有任何数量的观察者。
 * 抽象主题提供一个接口，可以增加和删除观察者对象，又叫做抽象被观察者(Observable)角色。
 * <p>
 * 一般情况下，各个具体主题角色对观察者聚集的管理方法是相同的，也就是说，
 * 这些聚集管理方法本身就是所有具体主题角色所共有的，因此这些方法连同聚集本身都可以移到抽象主题角色中去。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-10
 */
public abstract class Subject {

	private List<Observer> observers;// 观察者列表

	private List<Observer> getObservers() {
		if (observers == null) {
			observers = new ArrayList<Observer>();
		}
		return observers;
	}

	/**
	 * 增加一个观察者
	 */
	public void addObserver(Observer observer) {
		getObservers().add(observer);
	}

	/**
	 * 删除一个观察者
	 */
	public void removeObserver(Observer observer) {
		getObservers().remove(observer);
	}

	/**
	 * 通知所有的观察者，让它们自己更新自己
	 */
	public void notifyObservers() {
		System.out.println("notify all observers");
		for (Observer observer : getObservers()) {
			observer.update();
		}
	}
}
