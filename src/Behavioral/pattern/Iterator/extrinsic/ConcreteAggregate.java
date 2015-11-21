/**
 * 
 */
package pattern.Iterator.extrinsic;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚集
 * <p>
 * 具体聚集(ConcreteAggregate)角色
 * 实现了创建迭代子对象的接口，返回一个合适的具体迭代子实例。
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
