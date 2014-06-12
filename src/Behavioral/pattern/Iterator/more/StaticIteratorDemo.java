/**
 * 
 */
package pattern.Iterator.more;

import java.util.ArrayList;
import java.util.List;

/**
 * 静态迭代器
 * <p>
 * 静态迭代子由聚集对象创建，并持有聚集对象的一个快照(snapshot)，在产生后这个快照的内容就不再变化。
 * 客户端可以继续修改原聚集的内容，但是迭代子对象不会反映出聚集的新变化。
 * <p>
 * 静态迭代子的好处是它的安全性和简易性，换言之，静态迭代子易于实现，不容易出现错误。
 * 但是由于静态迭代子将原聚集复制了一份(或类似操作)，因此它的缺点是对时间和内存资源的消耗。
 * 对于大型的聚集对象来说，使用静态迭代子不是一个合适的选择。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-17
 */
public class StaticIteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Aggregate<Integer> aggregate = new ConcreteAggregate2<Integer>();
		for (int i = 0; i < 10; i++) {
			aggregate.add(i);
		}
		// 先获取一个静态迭代器，然后聚集删除一个元素
		Iterator<Integer> it = aggregate.iterator();
		aggregate.remove(new Integer("0"));
		System.out.println("iterate all elements by static Iterator:");
		while (it.hasNext()) {
			System.out.print(it.next() + ",");
		}
		System.out.println();
		// 删除之后再获取一个迭代器
		it = aggregate.iterator();
		System.out.println("iterate all elements by static Iterator:");
		while (it.hasNext()) {
			System.out.print(it.next() + ",");
		}
	}
}

class ConcreteAggregate2<T> implements Aggregate<T> {

	private List<T> list;

	public ConcreteAggregate2() {
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
		return new StaticIterator();
	}

	@Override
	public Iterator<T> iterator(Filter<T> filter) {
		return null;
	}

	/**
	 * 静态迭代子
	 */
	class StaticIterator implements Iterator<T> {

		private List<T> snapshot;// 聚集对象的一个快照

		private int cursor = 0;// 游标

		public StaticIterator() {
			this.snapshot = new ArrayList<T>();
			snapshot.addAll(list);
		}

		@Override
		public boolean hasNext() {
			return cursor < snapshot.size();
		}

		@Override
		public T next() {
			return snapshot.get(cursor++);
		}
	}
}