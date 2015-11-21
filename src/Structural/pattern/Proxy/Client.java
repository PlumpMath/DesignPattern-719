/**
 * 
 */
package pattern.Proxy;

/**
 * 客户端
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-20
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 直接使用代理对象
		Subject subject = new ProxySubject();
		subject.request();
	}
}
