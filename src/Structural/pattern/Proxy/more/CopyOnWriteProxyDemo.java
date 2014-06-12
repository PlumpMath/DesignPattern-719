/**
 * 
 */
package pattern.Proxy.more;

/**
 * Copy-on-Write代理
 * <p>
 * 虚拟代理的一种。把复制(克隆)拖延到只有在客户端需要时才真正采取行动。
 * <p>
 * 问题场景：<p>
 * 假设有一个大对象，会被多个客户端(线程)并发访问。<br>
 * 其中一个客户端想要执行一系列连续的取值(读)操作，
 * 在这期间不允许其他的客户端修改(写)对象信息的操作。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-22
 */
public class CopyOnWriteProxyDemo {
}

/**
 * 解决方案1
 * <p>
 * 使用锁机制，当客户端想要执行一系列连续的读操作时先将该对象加锁，操作完成后再释放锁。
 * <p>
 * 缺点：<p>
 * 这个客户端会持有这个对象的锁较长一段时间，在这期间会阻止其他线程访问该对象。
 * 对于其他线程读取该对象信息的操作，这种阻止是没有什么实际意义的。
 */
class SolutionUsingLock {
	
	public void doFetches(IOObject object) {
		synchronized (object) {
			// do something
		}
	}
}

/**
 * 解决方案2
 * <p>
 * 使用克隆，客户端先克隆该对象，然后使用克隆后的对象进行读操作。
 * 这就需要对象必须支持克隆，并且提供了一个方法能够对其进行深克隆。
 * <p>
 * 优点：<p>
 * 对象只有在克隆时才会被加锁，克隆一旦完成，客户端的读操作将会在克隆对象上进行，而不用对原对象加锁。<br>
 * 缺点：<p>
 * 在该客户端执行一系列连续的读操作时如果没有其他的线程修改(写)该对象，那么高代价的克隆操作就是一种浪费。
 */
class SolutionUsingClone {
	
	public void doFetches(IOObject object) {
		IOObject cloned = (IOObject) object.clone();
		// 在克隆对象上进行一系列的读操作
		cloned.read();
		// do something
	}
}

/**
 * 解决方案3
 * <p>
 * 如果能够在客户端真正需要克隆(也就是当其他客户端确实修改(写)该对象)的时候，
 * 才进行真正的克隆操作，这将会是最高效的。
 * 也就是说，客户端如果要执行一系列连续的读操作时，它可以调用clone()方法，
 * 但是只有在其他客户端确实要修改(写)该对象时才会进行真正的克隆，否则仍然使用原对象。
 * 这就是Copy-on-Write(写时复制)克隆操作，可以用代理模式实现这种方案。
 */
class SolutionUsingProxy {
	
	public void doFetches() {
		/* Thread1 */
		IOable proxy = new IOObjectProxy();
		proxy.read();
		
		/* Thread2 */
		// 克隆一个IOObjectProxy的代价是很小的，因为它只是一个代理对象
		IOable proxy2 =  (IOable) ((IOObjectProxy)proxy).clone();
		// 这时候只是读操作，所以仅仅是克隆了代理对象，而没有克隆IOObject
		proxy2.read();
		
		/* Thread3 */
		IOable proxy3 =  (IOable) ((IOObjectProxy)proxy).clone();
		// 当修改对象的时候，才会进行真正的clone()操作，也就是克隆IOObject
		proxy3.write();
	}
}

/**
 * 可读写的对象接口
 */
interface IOable extends Cloneable {

	public void write();

	public void read();
}

/**
 * 可读写的对象
 */
class IOObject implements IOable {

	@Override
	public void read() {
		System.out.println("读取对象信息");
	}

	@Override
	public void write() {
		System.out.println("修改对象信息");
	}

	/**
	 * IOObject对象的clone()操作是费时并且代价高的
	 */
	@Override
	public synchronized Object clone() {
		try {
			return super.clone();
		} catch (Exception e) {
			return null;
		}
	}
}

/**
 * 可读写对象代理
 */
class IOObjectProxy implements IOable {

	private IOObject object;// 真正的可读写对象

	public IOObjectProxy() {
		// do nothing
	}

	private IOObject getIOObject() {
		if (object == null) {
			object = new IOObject();
		}
		return object;
	}

	@Override
	public void read() {
		getIOObject().read();
	}

	@Override
	public void write() {
		// 写的时候就会将其引用的真正可读写对象替换为原对象的副本
		copyOnWirte();
		getIOObject().write();
	}

	private void copyOnWirte() {
		// 对真正的可读写对象进行克隆
		this.object = (IOObject) object.clone();
	}

	/**
	 * 代理对象的clone()是浅克隆，实际上原对象和它的克隆对象都共享同一个IOObject
	 * 除非某个代理对象的write()方法被调用了，这时候该代理对象会使用IOObject的克隆对象
	 */
	@Override
	public synchronized Object clone() {
		try {
			return super.clone();
		} catch (Exception e) {
			return null;
		}
	}
}