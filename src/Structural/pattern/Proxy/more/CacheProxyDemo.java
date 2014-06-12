/**
 * 
 */
package pattern.Proxy.more;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Cache������ʾ
 * <p>
 * Ϊĳһ��Ŀ������Ľ���ṩ��ʱ�Ĵ洢�ռ䣬�Ա����ͻ��˿��Թ�����Щ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-22
 */
public class CacheProxyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebPageService service = WebPageCacheProxy.getInstance();
		System.out.println(service.fetchWebPage("1"));
		System.out.println(service.fetchWebPage("1"));
		System.out.println(service.fetchWebPage("2"));
		try {
			Thread.sleep(6000);// ��ͣ6���Ա㻺���е���ҳ����
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(service.fetchWebPage("1"));
		System.out.println(service.fetchWebPage("2"));
		System.out.println(service.fetchWebPage("1"));
		System.out.println(service.fetchWebPage("2"));
	}
}

/**
 * ��ҳ
 */
class WebPage {
	
	private String id;// ��ʶ��
	private String content;// ����
	private Date timestamp;// ʱ���

	public WebPage(String id, String content) {
		this.id = id;
		this.content = content;
		this.timestamp = new Date();
	}

	public String getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String toString() {
		return "id =" + id + " content=" + content + " ts="
				+ timestamp.getTime() + "\n";
	}
}

/**
 * WebPageService�ӿ�
 */
interface WebPageService {

	/**
	 * ���ݱ�ʶ��������ҳ
	 */
	public WebPage fetchWebPage(String id);

	/**
	 * ���ݱ�ʶ����ʱ����жϸ���ҳ�Ƿ����
	 * 
	 * @param id
	 *            ��ҳ��ʶ��
	 * @param timestamp
	 *            ʱ���
	 */
	public boolean isOutOfDate(String id, Date timestamp);
}

/**
 * WebPageServiceImpl�ķ�������ʵ��
 */
class WebPageServiceImpl implements WebPageService {

	/** ��ҳĬ����Ч��Ϊ5��(�뵱ǰʱ���) */
	private static final long INTERVAL = 5*1000;
	
	/**
	 * ���ݱ�ʶ�����ط�������ǰ����ҳ
	 */
	@Override
	public WebPage fetchWebPage(String id) {
		return new WebPage(id, new Date().toString());
	}

	/**
	 * ���ݱ�ʶ����ʱ����жϸ���ҳ�Ƿ����(��Ч��Ϊ5��)
	 */
	@Override
	public boolean isOutOfDate(String id, Date timestamp) {
		return new Date().getTime() - timestamp.getTime() > INTERVAL;
	}
}

/**
 * WebPageService�Ļ������
 * <p>
 * ������Ǳ������ͻ���ʹ�õ��࣬��Ϊ�����˻�����ƣ��������Ӧ�ٶ�
 */
class WebPageCacheProxy implements WebPageService {

	// ����
	public static WebPageCacheProxy proxy = new WebPageCacheProxy();
	// ����Map
	private static Map<String, WebPage> id_webpage_map = new HashMap<String, WebPage>();
	// ������WebPageService����
	private WebPageService webPageService;

	private WebPageCacheProxy() {
		// do nothing
	}

	private WebPageService getWebPageService() {
		if (webPageService == null) {
			webPageService = new WebPageServiceImpl();
		}
		return webPageService;
	}

	/**
	 * ����WebPageService�Ļ���������
	 */
	public static WebPageService getInstance() {
		return proxy;
	}

	/**
	 * ���ݱ�ʶ��������ҳ(ʹ���˻������)
	 */
	@Override
	public WebPage fetchWebPage(String id) {
		WebPage webpage = id_webpage_map.get(id);
		if (webpage != null) {
			// ��������ָ����ҳ����û�й�����ֱ�ӷ��ػ����еĶ���
			if (!isOutOfDate(id, webpage.getTimestamp())) {
				System.out.println("webpage from cache.");
				return webpage;
			}
			System.out.println("webpage is out of date.");
		}
		// ������û��ָ����ҳ�����Ѿ�������ȥ������ȡ���µ���ҳ�����뻺��
		webpage = getWebPageService().fetchWebPage(id);
		id_webpage_map.put(id, webpage);
		return webpage;
	}

	/**
	 * ί�и�������WebPageService����ȥʵ��
	 */
	@Override
	public boolean isOutOfDate(String id, Date timestamp) {
		return getWebPageService().isOutOfDate(id, timestamp);
	}
}