/**
 * 
 */
package pattern.Iterator.more;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤迭代子
 * <p>
 * 过滤迭代子可以在扫过聚集元素的同时进行计算，
 * 以确定呈献给客户端的元素都是满足某一个过滤条件的，
 * 或者这些元素已经经过了重新的排列。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-17
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
		// 使用正常迭代子遍历聚集
		System.out.println("iterate all elements by Iterator:");
		Iterator<Integer> it = aggregate.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + ",");
		}
		System.out.println();
		// 使用过滤迭代子遍历聚集
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
	 * 返回一个迭代器
	 */
	public Iterator<T> iterator();
	
	/**
	 * 返回一个过滤迭代器
	 */
	public Iterator<T> iterator(Filter<T> filter);
}

interface Iterator<E> {

	public boolean hasNext();
	
	public E next();
}

/**
 * 过滤器
 */
interface Filter<T> {
	
	/**
	 * 判断参数是否被接受
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
	 * 正常迭代子
	 */
	class ConcreteIterator implements Iterator<T> {

		private int cursor = 0;// 游标

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
	 * 过滤迭代子
	 */
	class FilterIterator implements Iterator<T> {

		private Filter<T> filter;// 过滤器
		
		private List<T> accepted;// 接受的元素列表
		
		private int cursor = 0;// 游标

		public FilterIterator(Filter<T> filter) {
			this.filter = filter;
			this.accepted = new ArrayList<T>();
			// 将合格的元素存储到另外一个聚集accepted中，实际上是对它的遍历
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