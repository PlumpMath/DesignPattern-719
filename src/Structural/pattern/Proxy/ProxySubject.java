/**
 * 
 */
package pattern.Proxy;

/**
 * 代理主题(Proxy)角色
 * <p>
 * <li>1.内部含有对真实主题的引用，从而可以在任何时候操作真实主题对象；
 * <li>2.代理主题角色提供一个与真实主题角色相同的接口，以便可以在任何时候都可以替代真实主题；
 * <li>3.控制对真实主题的引用，负责在需要的时候创建真实主题对象(和删除真实主题对象)；
 * <li>4.代理角色通常在将客户端调用传递给真实的主题之前或者之后， 都要执行某个操作，而不是单纯地将调用传递给真实主题对象。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-20
 */
public class ProxySubject implements Subject {// 2 的体现 

	private Subject realSubject;// 1 的体现

	public ProxySubject() {
		// do nothing
	}
	
	/**
	 * 代理模式可能并不知道真正的被代理对象，而仅仅持有一个被代理对象的接口。
	 * 这时候代理对象不能够创建被代理对象，被代理对象必须由系统的其他角色代为创建并且传入。
	 * 实际上这种做法可以提供更大的灵活性。
	 */
	public ProxySubject(Subject realSubject) {
		this.realSubject = realSubject;
	} 

	@Override
	public void request() {
		preRequest();// 4 的体现
		getRealSubject().request();
		postRequest();// 4 的体现
	}

	private Subject getRealSubject() {// 3 的体现
		if (realSubject == null) {
			realSubject = new RealSubject();
		}
		return realSubject;
	}

	private void preRequest() {
		System.out.println("ProxySubject.preRequest()");
	}

	private void postRequest() {
		System.out.println("ProxySubject.postRequest()");
	}
}