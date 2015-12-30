/**
 * 
 */
package pattern.Proxy.more;

/**
 * 同步(Synchronization)代理演示
 * <p>
 * 使几个用户能够同时使用一个对象而没有冲突。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-22
 */
public class SynchronizationProxyDemo {
}

/**
 * List接口
 */
interface IList {

	/**
	 * 获取指定索引元素
	 */
	public Object get(int index);

	/**
	 * 设置指定索引为指定对象
	 */
	public void set(int index, Object object);

	/**
	 * 返回列表大小
	 */
	public int size();
}

/**
 * 真正的List
 * <p>
 * 它所实现的方法都不是同步的，也就是线程不安全的，当多个线程并发访问同一个List对象时，无法保证安全性。
 * 但是这个List类是其他库提供的(class文件)，无法进行修改，这时候只要使用同步化代理就可以解决线程安全性问题。
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
 * 线程安全的List代理类
 */
class SynchronizationListProxy implements IList {

	private List list;// 真正的List对象

	public SynchronizationListProxy() {
		list = new List();
	}
	
	// 下面的方法都是线程安全的
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
