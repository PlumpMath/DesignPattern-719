/**
 * 
 */
package pattern.Iterator.extrinsic;

/**
 * 具体迭代子
 * <p>
 * 具体迭代子(ConcreteIterator)角色
 * 此角色实现了Iterator接口，并保持迭代过程中的游标位置。
 * <p>
 * 这是外禀迭代子(Extrinsic Iterator)的实现，因为该迭代子类是在聚集的结构之外定义的。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-17
 */
public class ConcreteIterator<E> implements Iterator<E> {

	private ConcreteAggregate<E> aggregate;// 待遍历的聚集

	private int cursor = 0;// 游标

	public ConcreteIterator(ConcreteAggregate<E> aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public boolean hasNext() {
		return cursor < aggregate.size();
	}

	@Override
	public E next() {
		return aggregate.get(cursor++);
	}
}
