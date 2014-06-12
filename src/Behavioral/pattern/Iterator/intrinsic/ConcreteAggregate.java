/**
 * 
 */
package pattern.Iterator.intrinsic;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚集
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-17
 */
public class ConcreteAggregate<T> implements Aggregate<T> {

	private List<T> list;// 内部实现用List

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
	 * 具体迭代子
	 * <p>
     * 具体迭代子(ConcreteIterator)角色
     * 此角色实现了Iterator接口，并保持迭代过程中的游标位置。
     * <p>
     * 这是内禀迭代子(Intrinsic Iterator)的实现
     * 因为该迭代子类是在聚集的结构内定义的。
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
}