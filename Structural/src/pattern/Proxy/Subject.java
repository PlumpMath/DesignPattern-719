/**
 * 
 */
package pattern.Proxy;

/**
 * 抽象主题角色
 * <p>
 * 声明了真实主题和代理主题的共同接口，因此在任何可以使用真实主题的地方都可以使用代理主题。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-20
 */
public interface Subject {

	/**
	 * 请求方法
	 */
	public void request();
}
