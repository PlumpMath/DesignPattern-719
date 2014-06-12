/**
 * 
 */
package pattern.Proxy.more;

/**
 * Copy-on-Write����
 * <p>
 * ��������һ�֡��Ѹ���(��¡)���ӵ�ֻ���ڿͻ�����Ҫʱ��������ȡ�ж���
 * <p>
 * ���ⳡ����<p>
 * ������һ������󣬻ᱻ����ͻ���(�߳�)�������ʡ�<br>
 * ����һ���ͻ�����Ҫִ��һϵ��������ȡֵ(��)������
 * �����ڼ䲻���������Ŀͻ����޸�(д)������Ϣ�Ĳ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-22
 */
public class CopyOnWriteProxyDemo {
}

/**
 * �������1
 * <p>
 * ʹ�������ƣ����ͻ�����Ҫִ��һϵ�������Ķ�����ʱ�Ƚ��ö��������������ɺ����ͷ�����
 * <p>
 * ȱ�㣺<p>
 * ����ͻ��˻���������������ϳ�һ��ʱ�䣬�����ڼ����ֹ�����̷߳��ʸö���
 * ���������̶߳�ȡ�ö�����Ϣ�Ĳ�����������ֹ��û��ʲôʵ������ġ�
 */
class SolutionUsingLock {
	
	public void doFetches(IOObject object) {
		synchronized (object) {
			// do something
		}
	}
}

/**
 * �������2
 * <p>
 * ʹ�ÿ�¡���ͻ����ȿ�¡�ö���Ȼ��ʹ�ÿ�¡��Ķ�����ж�������
 * �����Ҫ�������֧�ֿ�¡�������ṩ��һ�������ܹ�����������¡��
 * <p>
 * �ŵ㣺<p>
 * ����ֻ���ڿ�¡ʱ�Żᱻ��������¡һ����ɣ��ͻ��˵Ķ����������ڿ�¡�����Ͻ��У������ö�ԭ���������<br>
 * ȱ�㣺<p>
 * �ڸÿͻ���ִ��һϵ�������Ķ�����ʱ���û���������߳��޸�(д)�ö�����ô�ߴ��۵Ŀ�¡��������һ���˷ѡ�
 */
class SolutionUsingClone {
	
	public void doFetches(IOObject object) {
		IOObject cloned = (IOObject) object.clone();
		// �ڿ�¡�����Ͻ���һϵ�еĶ�����
		cloned.read();
		// do something
	}
}

/**
 * �������3
 * <p>
 * ����ܹ��ڿͻ���������Ҫ��¡(Ҳ���ǵ������ͻ���ȷʵ�޸�(д)�ö���)��ʱ��
 * �Ž��������Ŀ�¡�������⽫�������Ч�ġ�
 * Ҳ����˵���ͻ������Ҫִ��һϵ�������Ķ�����ʱ�������Ե���clone()������
 * ����ֻ���������ͻ���ȷʵҪ�޸�(д)�ö���ʱ�Ż���������Ŀ�¡��������Ȼʹ��ԭ����
 * �����Copy-on-Write(дʱ����)��¡�����������ô���ģʽʵ�����ַ�����
 */
class SolutionUsingProxy {
	
	public void doFetches() {
		/* Thread1 */
		IOable proxy = new IOObjectProxy();
		proxy.read();
		
		/* Thread2 */
		// ��¡һ��IOObjectProxy�Ĵ����Ǻ�С�ģ���Ϊ��ֻ��һ���������
		IOable proxy2 =  (IOable) ((IOObjectProxy)proxy).clone();
		// ��ʱ��ֻ�Ƕ����������Խ����ǿ�¡�˴�����󣬶�û�п�¡IOObject
		proxy2.read();
		
		/* Thread3 */
		IOable proxy3 =  (IOable) ((IOObjectProxy)proxy).clone();
		// ���޸Ķ����ʱ�򣬲Ż����������clone()������Ҳ���ǿ�¡IOObject
		proxy3.write();
	}
}

/**
 * �ɶ�д�Ķ���ӿ�
 */
interface IOable extends Cloneable {

	public void write();

	public void read();
}

/**
 * �ɶ�д�Ķ���
 */
class IOObject implements IOable {

	@Override
	public void read() {
		System.out.println("��ȡ������Ϣ");
	}

	@Override
	public void write() {
		System.out.println("�޸Ķ�����Ϣ");
	}

	/**
	 * IOObject�����clone()�����Ƿ�ʱ���Ҵ��۸ߵ�
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
 * �ɶ�д�������
 */
class IOObjectProxy implements IOable {

	private IOObject object;// �����Ŀɶ�д����

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
		// д��ʱ��ͻὫ�����õ������ɶ�д�����滻Ϊԭ����ĸ���
		copyOnWirte();
		getIOObject().write();
	}

	private void copyOnWirte() {
		// �������Ŀɶ�д������п�¡
		this.object = (IOObject) object.clone();
	}

	/**
	 * ��������clone()��ǳ��¡��ʵ����ԭ��������Ŀ�¡���󶼹���ͬһ��IOObject
	 * ����ĳ����������write()�����������ˣ���ʱ��ô�������ʹ��IOObject�Ŀ�¡����
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