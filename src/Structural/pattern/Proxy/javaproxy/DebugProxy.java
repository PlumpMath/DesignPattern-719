/**
 * 
 */
package pattern.Proxy.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * debug模式代理类
 * <p>
 * 可以根据需要打印出对象调用方法的细节和信息
 * <p>
 * Java提供了Proxy、InvocationHandler、Method三个类直接支持代理模式。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-22
 */
public class DebugProxy implements InvocationHandler {

	private Object object;

	/**
	 * 为指定对象创建一个动态代理对象
	 */
	public static Object newInstance(Object obj) {
		// 可以按照下面的步骤创建动态代理对象：
		ClassLoader classLoader = obj.getClass().getClassLoader();
		// 1.指明一系列的接口来创建一个代理对象
		Class<?>[] interfaces = obj.getClass().getInterfaces();
		// 2.创建一个调用处理器(InvocationHandler)对象
		DebugProxy handler = new DebugProxy(obj);
		// 3.将这个代理(handler)指定为某个其他对象的代理对象
		// Proxy类能够在运行时间创建代理对象(即动态代理)
		return Proxy.newProxyInstance(classLoader, interfaces, handler);
	}

	private DebugProxy(Object obj) {
		this.object = obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// 4.在调用处理器的invoke()方法中采取代理，一方面将调用传递给真实对象，另一方面执行各种需要做的操作
		System.out.println("***before calling***\n" + method);
		if(args != null) {
			for (int i = 0; i < args.length; i++) {
				System.out.print("args " + i + " : " + args[i]);
			}
			System.out.println();
		}
		Object result = method.invoke(object, args);
		System.out.println("***after calling***\n" + method);
		return result;
	}
}