/**
 * 
 */
package pattern.Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * ԭ�͹�����(Prototype Manager)��ɫ
 * <p>
 * ��������ԭ����Ķ��󣬲���¼ÿһ���������Ķ���
 * <p>
 * �����Ҫ������ԭ�Ͷ�����Ŀ���ٶ��ұȽϹ̶��Ļ������Բ�ȡ����ʽ��
 * ����������£�ԭ�Ͷ�������ÿ����ɿͻ����Լ����档
 * 
 * ���Ҫ������ԭ�Ͷ�����Ŀ���̶��Ļ������Բ�ȡ�Ǽ���ʽ��
 * ����������£��ͻ��˲��������ԭ�Ͷ�������ã�������񱻽�������������
 * �ڸ���һ��ԭ�Ͷ���֮ǰ�����������Ȳ鿴�Ƿ��Ѿ���һ������������ԭ�Ͷ���Ǽ��ڲᡣ
 * ����У���ֱ��ʹ�����ԭ�Ͷ�����п�¡�����û�У���������Ҫ���д���һ��ԭ�Ͷ��󣬲�����Ǽǣ�Ȼ��ʹ�������п�¡��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-28
 */
public class PrototypeManager {

	private static PrototypeManager manager;

	private Map<String, Prototype> map;// �����Ǽ�ԭ�Ͷ���

	private PrototypeManager() {
		// singleton and do nothing
	}

	public synchronized static PrototypeManager getInstance() {
		if (manager == null) {
			manager = new PrototypeManager();
		}
		return manager;
	}

	/**
	 * ����ָ���������ͷ�����ʵ��
	 * 
	 * @param which
	 *            "A"��"B"��"C"
	 */
	public Prototype getPrototype(String which) {
		Prototype prototype = getMap().get(which);
		if (prototype == null) {
			if ("A".equals(which)) {
				prototype = new ConcretePrototypeA();
			} else if ("B".equals(which)) {
				prototype = new ConcretePrototypeB();
			} else {
				prototype = new ConcretePrototypeC();
			}
			registerPrototype(which, prototype);
		}
		return (Prototype) prototype.clone();
	}

	private void registerPrototype(String which, Prototype prototype) {
		getMap().put(which, prototype);
		System.out.println("put Prototype " + which + " instance into map.");
	}

	private Map<String, Prototype> getMap() {
		if (map == null) {
			map = new HashMap<String, Prototype>();
		}
		return map;
	}
}