/**
 * 
 */
package pattern.Proxy.more;

/**
 * 远程(Remote)代理演示
 * <p>
 * 为一个位于不同的地址空间的对象提供一个局域代表对象。
 * 这个不同的地址空间可以是在本机器中，也可以是在另一台机器中。
 * <p>
 * 优点：<p>
 * 系统可以将网络的细节隐藏起来，使得客户端不必考虑网络的存在。<br>
 * 客户完全可以认为被代理的对象是局域的而不是远程的，
 * 而代理对象承担了大部分的网络通信工作。<p>
 * 缺点：<p>
 * 由于客户可能没有意识到会启动一个耗费时间的远程调用，因此客户没有必要的思想准备。
 * <p>
 * 远程代理是RMI、CORBA这些分布式对象技术的根本
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-22
 */
public class RemoteProxyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 客户端程序直接使用WebServiceProxy，它并不关心服务器端的对象
		WebService service = new WebServiceProxy();
		System.out.println("message :" + service.getMessage());
	}
}

/**
 * WebService接口
 */
interface WebService {

	/**
	 * 返回消息
	 */
	public String getMessage();
}

/**
 * WebService的服务器端实现
 * <p>
 * 这个类以及它的对象应该分步在服务器端
 */
class WebServiceImpl implements WebService {

	@Override
	public String getMessage() {
		for (int i = 0; i < 5; i++) {
			try {
				// 模拟服务器进行某些操作
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.print(".");
		}
		System.out.println();
		return "Hello Client!";
	}
}

/**
 * WebService的客户端代理
 * <p>
 * 这个类以及它的对象应该分步在客户端
 */
class WebServiceProxy implements WebService {

	private WebService webService;

	public WebServiceProxy() {
		// do nothing
	}

	@Override
	public String getMessage() {
		// 懒加载，只有被调用时才创建真正的服务对象
		if (webService == null) {
			webService = new WebServiceImpl();
		}
		System.out.println("send request to server......");
		String message = webService.getMessage();
		System.out.println("receive responses from server......");
		return message;
	}
}