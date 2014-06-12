/**
 * 
 */
package pattern.Observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * ������
 * <p>
 * ʵ�����ǹ۲��߽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-10
 */
public class Subscriber implements Observer {

	private String name;

	public Subscriber(String name) {
		this.name = name;
	}

	/**
	 * �����Լ�
	 * <p>
	 * ���ｫ�����߽��յ���RSSFeed�����ݴ�ӡ����
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		RSSFeed feed = (RSSFeed) o;
		System.out.println("Subscriber " + name
				+ " receive a new message from " + feed.getName() + "("
				+ feed.getUrl() + ")");
		System.out.println(feed.getContent());
	}
}