/**
 * 
 */
package pattern.Iterator.more;

import java.util.ArrayList;
import java.util.List;

/**
 * ��̬������
 * <p>
 * ��̬�������ɾۼ����󴴽��������оۼ������һ������(snapshot)���ڲ�����������յ����ݾͲ��ٱ仯��
 * �ͻ��˿��Լ����޸�ԭ�ۼ������ݣ����ǵ����Ӷ��󲻻ᷴӳ���ۼ����±仯��
 * <p>
 * ��̬�����ӵĺô������İ�ȫ�Ժͼ����ԣ�����֮����̬����������ʵ�֣������׳��ִ���
 * �������ھ�̬�����ӽ�ԭ�ۼ�������һ��(�����Ʋ���)���������ȱ���Ƕ�ʱ����ڴ���Դ�����ġ�
 * ���ڴ��͵ľۼ�������˵��ʹ�þ�̬�����Ӳ���һ�����ʵ�ѡ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-17
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
		// �Ȼ�ȡһ����̬��������Ȼ��ۼ�ɾ��һ��Ԫ��
		Iterator<Integer> it = aggregate.iterator();
		aggregate.remove(new Integer("0"));
		System.out.println("iterate all elements by static Iterator:");
		while (it.hasNext()) {
			System.out.print(it.next() + ",");
		}
		System.out.println();
		// ɾ��֮���ٻ�ȡһ��������
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
	 * ��̬������
	 */
	class StaticIterator implements Iterator<T> {

		private List<T> snapshot;// �ۼ������һ������

		private int cursor = 0;// �α�

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