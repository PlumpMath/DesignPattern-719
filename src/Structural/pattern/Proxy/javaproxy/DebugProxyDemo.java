/**
 * 
 */
package pattern.Proxy.javaproxy;

import java.util.ArrayList;
import java.util.List;

/**
 * ��̬����ʹ��ʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-22
 */
public class DebugProxyDemo {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// ΪArrayList���󴴽�һ���������
		List<String> proxy = (List<String>) DebugProxy.newInstance(new ArrayList<String>());
		// ��ϵͳ����һ���������󣬶Դ������ķ������û����ȱ����ɸ�һ�����ô�����(InvocationHandler)
		proxy.add("first");
		proxy.add("second");
	}
}