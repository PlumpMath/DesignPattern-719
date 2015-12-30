/**
 * 
 */
package pattern.Proxy;

/**
 * 真实主题角色
 * <p>
 * 定义了代理主题角色所代表的真实对象
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-20
 */
public class RealSubject implements Subject {

	public RealSubject() {
		// do nothing
	}
	
	/**
	 * 真实主题中的request()方法
	 */
	@Override
	public void request() {
		System.out.println("RealSubject.request()");
	}
}
