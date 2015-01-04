/**
 * 
 */
package pattern.Proxy.more;

/**
 * ͬ��(Synchronization)������ʾ
 * <p>
 * ʹ�����û��ܹ�ͬʱʹ��һ�������û�г�ͻ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-22
 */
public class SynchronizationProxyDemo {
}

/**
 * List�ӿ�
 */
interface IList {

	/**
	 * ��ȡָ������Ԫ��
	 */
	public Object get(int index);

	/**
	 * ����ָ������Ϊָ������
	 */
	public void set(int index, Object object);

	/**
	 * �����б��С
	 */
	public int size();
}

/**
 * ������List
 * <p>
 * ����ʵ�ֵķ���������ͬ���ģ�Ҳ�����̲߳���ȫ�ģ�������̲߳�������ͬһ��List����ʱ���޷���֤��ȫ�ԡ�
 * �������List�����������ṩ��(class�ļ�)���޷������޸ģ���ʱ��ֻҪʹ��ͬ��������Ϳ��Խ���̰߳�ȫ�����⡣
 */
class List implements IList {

	public Object get(int index) {
		return null;
	}

	public void set(int index, Object object) {
		// do somthing
	}

	public int size() {
		return 0;
	}
}

/**
 * �̰߳�ȫ��List������
 */
class SynchronizationListProxy implements IList {

	private List list;// ������List����

	public SynchronizationListProxy() {
		list = new List();
	}
	
	// ����ķ��������̰߳�ȫ��
	public synchronized Object get(int index) {
		return list.get(index);
	}

	public synchronized void set(int index, Object object) {
		list.set(index, object);
	}

	public synchronized int size() {
		return list.size();
	}
}