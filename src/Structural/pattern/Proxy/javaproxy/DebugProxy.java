/**
 * 
 */
package pattern.Proxy.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * debugģʽ������
 * <p>
 * ���Ը�����Ҫ��ӡ��������÷�����ϸ�ں���Ϣ
 * <p>
 * Java�ṩ��Proxy��InvocationHandler��Method������ֱ��֧�ִ���ģʽ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-22
 */
public class DebugProxy implements InvocationHandler {

	private Object object;

	/**
	 * Ϊָ�����󴴽�һ����̬�������
	 */
	public static Object newInstance(Object obj) {
		// ���԰�������Ĳ��贴����̬�������
		ClassLoader classLoader = obj.getClass().getClassLoader();
		// 1.ָ��һϵ�еĽӿ�������һ���������
		Class<?>[] interfaces = obj.getClass().getInterfaces();
		// 2.����һ�����ô�����(InvocationHandler)����
		DebugProxy handler = new DebugProxy(obj);
		// 3.���������(handler)ָ��Ϊĳ����������Ĵ������
		// Proxy���ܹ�������ʱ�䴴���������(����̬����)
		return Proxy.newProxyInstance(classLoader, interfaces, handler);
	}

	private DebugProxy(Object obj) {
		this.object = obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// 4.�ڵ��ô�������invoke()�����в�ȡ����һ���潫���ô��ݸ���ʵ������һ����ִ�и�����Ҫ���Ĳ���
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