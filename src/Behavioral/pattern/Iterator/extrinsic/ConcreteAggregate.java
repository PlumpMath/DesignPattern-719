/**
 * 
 */
package pattern.Iterator.extrinsic;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ۼ�
 * <p>
 * ����ۼ�(ConcreteAggregate)��ɫ
 * ʵ���˴��������Ӷ���Ľӿڣ�����һ�����ʵľ��������ʵ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-17
 */
public class ConcreteAggregate<T> implements Aggregate<T> {

	private List<T> list;// �ڲ�ʵ����List

	public ConcreteAggregate() {
		list = new ArrayList<T>();
	}

	@Override
	public void add(T t) {
		list.add(t);
	}

	@Override
	public T get(int index) {
		return list.get(index);
	}

	@Override
	public void remove(T t) {
		list.remove(t);
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public Iterator<T> iterator() {
		return new ConcreteIterator<T>(this);
	}
}