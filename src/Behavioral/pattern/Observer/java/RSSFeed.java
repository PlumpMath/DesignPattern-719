/**
 * 
 */
package pattern.Observer.java;

import java.util.Observable;

/**
 * RSSFeed��
 * <p>
 * Java�ṩ��һ��Observable���Observer�ӿڶԹ۲���ģʽ����֧��
 * ���۲����඼��Observable�������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-10
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
	 * RSS��������
	 */
	public void publish(String content) {
		// ֻ�е�����ȴ�Ǳ仯�˲Ž��з���
		if (!content.equals(this.content)) {
			this.content = content;
			/*
			 * Observable.setChanged()����������֮�������
			 * һ���ڲ���Ǳ��������۲��߶����״̬�����˱仯
			 */
			setChanged();
			/*
			 * Observable.notifyObservers()������֪ͨ���еĹ۲���
			 * �������ǵ�update()������ʹ���ǿ��Ը����Լ�
			 * ��Ĭ�ϰ��չ۲��߶��󱻵ǼǵĴ�����෴����֪ͨ����
			 */
			notifyObservers();
		}
	}
}