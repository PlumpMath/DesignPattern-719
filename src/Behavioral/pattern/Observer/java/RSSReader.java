/**
 * 
 */
package pattern.Observer.java;

import java.util.Observer;

/**
 * RSSReader��
 * <p>
 * ����ģ��RSS���Ļ��ƣ������ǿͻ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-10
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
		// �����۲��߶����equals()��������trueʱ�����ᱻ���¼���
		baidu.addObserver(tom);
		baidu.addObserver(mike);
		google.addObserver(ann);
		google.addObserver(mike);

		baidu.publish("This message from baidu.");
		google.publish("This message from google.");
		google.publish("This message from google too.");
	}
}