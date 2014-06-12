/**
 * 
 */
package pattern.Iterator.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 队列
 * <p>
 * 具体聚集角色，采用内禀迭代子实现
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-14
 */
public class Queue<T> implements IQueue<T> {

	private List<T> queue = new ArrayList<T>();

	@Override
	public void add(T t) {
		queue.add(t);
	}

	@Override
	public void remove(T t) {
		queue.remove(t);
	}

	@Override
	public int size() {
		return queue.size();
	}

	@Override
	public BackwardIterator<T> backwardIterator() {
		return new QueueBackwardIterator();
	}

	@Override
	public ForwardIterator<T> forwardIterator() {
		return new QueueForwardIterator();
	}

	/**
	 * 向后遍历迭代子
	 */
	private class QueueBackwardIterator implements BackwardIterator<T> {

		private int index = 0;

		public boolean hasNext() {
			return index < queue.size();
		}

		public T next() {
			if (hasNext()) {
				return queue.get(index++);
			}
			throw new RuntimeException("index out of bounds.");
		}
	}

	/**
	 * 向前遍历迭代子
	 */
	private class QueueForwardIterator implements ForwardIterator<T> {

		private int index = queue.size() - 1;

		public boolean hasPrevious() {
			return index > -1;
		}

		public T previous() {
			if (hasPrevious()) {
				return queue.get(index--);
			}
			throw new RuntimeException("index out of bounds.");
		}
	}
}