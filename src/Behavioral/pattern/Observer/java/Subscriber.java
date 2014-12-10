/**
 * 
 */
package pattern.Observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * 订阅者
 * <p>
 * 实际上是观察者角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-10
 */
public class Subscriber implements Observer {

	private String name;

	public Subscriber(String name) {
		this.name = name;
	}

	/**
	 * 更新自己
	 * <p>
	 * 这里将订阅者接收到的RSSFeed的内容打印出来
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		// 获取发送通知的被观察者对象，好让观察者知道是哪个被观察者通知它（考虑同一个观察者监听两个不同的被观察者）
		RSSFeed feed = (RSSFeed) o;
		// 获取被观察者传入的数据对象
		String content = arg.toString();
		System.out.println("Subscriber " + name
				+ " receive a new message from " + feed.getName() + "("
				+ feed.getUrl() + ")");
		System.out.println(content);
	}
}