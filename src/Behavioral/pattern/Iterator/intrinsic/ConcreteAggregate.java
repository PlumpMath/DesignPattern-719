/**
 * 
 */
package pattern.Iterator.intrinsic;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ۼ�
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
	public void remove(T t) {
		list.remove(t);
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public Iterator<T> iterator() {
		return new ConcreteIterator();
	}
	
	/**
	 * ���������
	 * <p>
     * ���������(ConcreteIterator)��ɫ
     * �˽�ɫʵ����Iterator�ӿڣ������ֵ��������е��α�λ�á�
     * <p>
     * ��������������(Intrinsic Iterator)��ʵ��
     * ��Ϊ�õ����������ھۼ��Ľṹ�ڶ���ġ�
	 */
	class ConcreteIterator implements Iterator<T> {

		private int cursor = 0;// �α�

		@Override
		public boolean hasNext() {
			return cursor < size();
		}

		@Override
		public T next() {
			return list.get(cursor++);
		}
	}
}