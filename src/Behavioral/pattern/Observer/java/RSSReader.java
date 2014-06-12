/**
 * 
 */
package pattern.Observer.java;

import java.util.Observer;

/**
 * RSSReader类
 * <p>
 * 用来模拟RSS订阅机制，本类是客户端类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-10
 */
public class RSSReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RSSFeed baidu = new RSSFeed("baidu", "http://www.baidu.com");
		RSSFeed google = new RSSFeed("google", "http://www.google.com");
		Observer tom = new Subscriber("tom");
		Observer mike = new Subscriber("mike");
		Observer ann = new Subscriber("ann");
		// 两个观察者对象的equals()方法返回true时，不会被重新加入
		baidu.addObserver(tom);
		baidu.addObserver(mike);
		google.addObserver(ann);
		google.addObserver(mike);

		baidu.publish("This message from baidu.");
		google.publish("This message from google.");
		google.publish("This message from google too.");
	}
}