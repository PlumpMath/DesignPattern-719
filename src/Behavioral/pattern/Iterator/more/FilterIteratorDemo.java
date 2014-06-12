/**
 * 
 */
package pattern.Iterator.more;

import java.util.ArrayList;
import java.util.List;

/**
 * ���˵�����
 * <p>
 * ���˵����ӿ�����ɨ���ۼ�Ԫ�ص�ͬʱ���м��㣬
 * ��ȷ�����׸��ͻ��˵�Ԫ�ض�������ĳһ�����������ģ�
 * ������ЩԪ���Ѿ����������µ����С�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-17
 */
public class FilterIteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Aggregate<Integer> aggregate = new ConcreteAggregate<Integer>();
		for (int i = 0; i < 10; i++) {
			aggregate.add(i);
		}
		// ʹ�����������ӱ����ۼ�
		System.out.println("iterate all elements by Iterator:");
		Iterator<Integer> it = aggregate.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + ",");
		}
		System.out.println();
		// ʹ�ù��˵����ӱ����ۼ�
		System.out.println("iterate elements that > 5 by Filter Iterator:");
		Iterator<Integer> filterIterator = aggregate
				.iterator(new Filter<Integer>() {

					public boolean accept(Integer t) {
						return t > 5;
					}
				});
		while (filterIterator.hasNext()) {
			System.out.print(filterIterator.next() + ",");
		}
	}
}

interface Aggregate<T> {

	public void add(T t);

	public void remove(T t);

	public int size();

	/**
	 * ����һ��������
	 */
	public Iterator<T> iterator();
	
	/**
	 * ����һ�����˵�����
	 */
	public Iterator<T> iterator(Filter<T> filter);
}

interface Iterator<E> {

	public boolean hasNext();
	
	public E next();
}

/**
 * ������
 */
interface Filter<T> {
	
	/**
	 * �жϲ����Ƿ񱻽���
	 */
	public boolean accept(T t);
}

class ConcreteAggregate<T> implements Aggregate<T> {

	private List<T> list;

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
	
	@Override
	public Iterator<T> iterator(Filter<T> filter) {
		return new FilterIterator(filter);
	}
	
	/**
	 * ����������
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
	
	/**
	 * ���˵�����
	 */
	class FilterIterator implements Iterator<T> {

		private Filter<T> filter;// ������
		
		private List<T> accepted;// ���ܵ�Ԫ���б�
		
		private int cursor = 0;// �α�

		public FilterIterator(Filter<T> filter) {
			this.filter = filter;
			this.accepted = new ArrayList<T>();
			// ���ϸ��Ԫ�ش洢������һ���ۼ�accepted�У�ʵ�����Ƕ����ı���
			filter();
		}

		private void filter() {
			for (T t : list) {
				if (filter.accept(t)) {
					accepted.add(t);
				}
			}
		}

		@Override
		public boolean hasNext() {
			return cursor < accepted.size();
		}

		@Override
		public T next() {
			return accepted.get(cursor++);
		}
	}
}