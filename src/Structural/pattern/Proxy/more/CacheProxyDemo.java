/**
 * 
 */
package pattern.Proxy.more;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Cache代理演示
 * <p>
 * 为某一个目标操作的结果提供临时的存储空间，以便多个客户端可以共享这些结果。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-22
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
			Thread.sleep(6000);// 暂停6秒以便缓存中的网页过期
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
 * 网页
 */
class WebPage {
	
	private String id;// 标识符
	private String content;// 内容
	private Date timestamp;// 时间戳

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
 * WebPageService接口
 */
interface WebPageService {

	/**
	 * 根据标识符返回网页
	 */
	public WebPage fetchWebPage(String id);

	/**
	 * 根据标识符和时间戳判断该网页是否过期
	 * 
	 * @param id
	 *            网页标识符
	 * @param timestamp
	 *            时间戳
	 */
	public boolean isOutOfDate(String id, Date timestamp);
}

/**
 * WebPageServiceImpl的服务器端实现
 */
class WebPageServiceImpl implements WebPageService {

	/** 网页默认有效期为5秒(与当前时间比) */
	private static final long INTERVAL = 5*1000;
	
	/**
	 * 根据标识符返回服务器当前的网页
	 */
	@Override
	public WebPage fetchWebPage(String id) {
		return new WebPage(id, new Date().toString());
	}

	/**
	 * 根据标识符和时间戳判断该网页是否过期(有效期为5秒)
	 */
	@Override
	public boolean isOutOfDate(String id, Date timestamp) {
		return new Date().getTime() - timestamp.getTime() > INTERVAL;
	}
}

/**
 * WebPageService的缓存代理
 * <p>
 * 这个类是被各个客户端使用的类，因为它有了缓存机制，提高了响应速度
 */
class WebPageCacheProxy implements WebPageService {

	// 单例
	public static WebPageCacheProxy proxy = new WebPageCacheProxy();
	// 缓存Map
	private static Map<String, WebPage> id_webpage_map = new HashMap<String, WebPage>();
	// 真正的WebPageService对象
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
	 * 返回WebPageService的缓存代理对象
	 */
	public static WebPageService getInstance() {
		return proxy;
	}

	/**
	 * 根据标识符返回网页(使用了缓存机制)
	 */
	@Override
	public WebPage fetchWebPage(String id) {
		WebPage webpage = id_webpage_map.get(id);
		if (webpage != null) {
			// 缓存中有指定网页并且没有过期则直接返回缓存中的对象
			if (!isOutOfDate(id, webpage.getTimestamp())) {
				System.out.println("webpage from cache.");
				return webpage;
			}
			System.out.println("webpage is out of date.");
		}
		// 缓存中没有指定网页或者已经过期则去服务器取最新的网页并加入缓存
		webpage = getWebPageService().fetchWebPage(id);
		id_webpage_map.put(id, webpage);
		return webpage;
	}

	/**
	 * 委托给真正的WebPageService对象去实现
	 */
	@Override
	public boolean isOutOfDate(String id, Date timestamp) {
		return getWebPageService().isOutOfDate(id, timestamp);
	}
}