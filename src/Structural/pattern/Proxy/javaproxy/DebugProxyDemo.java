/**
 * 
 */
package pattern.Proxy.javaproxy;

import java.util.ArrayList;
import java.util.List;

/**
 * 动态代理使用示例
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-22
 */
public class DebugProxyDemo {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// 为ArrayList对象创建一个代理对象
		List<String> proxy = (List<String>) DebugProxy.newInstance(new ArrayList<String>());
		// 当系统有了一个代理对象后，对代理对象的方法调用会首先被分派给一个调用处理器(InvocationHandler)
		proxy.add("first");
		proxy.add("second");
	}
}
