/**
 * 
 */
package pattern.Observer.java;

import java.util.Observable;

/**
 * RSSFeed类
 * <p>
 * Java提供了一个Observable类和Observer接口对观察者模式进行支持
 * 被观察者类都是Observable类的子类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-10
 */
public class RSSFeed extends Observable {

	private String name;
	private String url;
	private String content;

	public RSSFeed(String name, String url) {
		this.name = name;
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	public String getContent() {
		return content;
	}

	/**
	 * RSS发布内容
	 */
	public void publish(String content) {
		// 只有当内容却是变化了才进行发布
		if (!content.equals(this.content)) {
			this.content = content;
			/*
			 * Observable.setChanged()方法被调用之后会设置
			 * 一个内部标记变量代表被观察者对象的状态发生了变化
			 */
			setChanged();
			/*
			 * Observable.notifyObservers()方法会通知所有的观察者
			 * 调用它们的update()方法，使它们可以更新自己
			 * 它默认按照观察者对象被登记的次序的相反次序通知它们
			 */
			notifyObservers();
		}
	}
}