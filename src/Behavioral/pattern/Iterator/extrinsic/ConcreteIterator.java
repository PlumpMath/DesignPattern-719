/**
 * 
 */
package pattern.Iterator.extrinsic;

/**
 * ���������
 * <p>
 * ���������(ConcreteIterator)��ɫ
 * �˽�ɫʵ����Iterator�ӿڣ������ֵ��������е��α�λ�á�
 * <p>
 * ��������������(Extrinsic Iterator)��ʵ��
 * ��Ϊ�õ����������ھۼ��Ľṹ֮�ⶨ��ġ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-17
 */
public class ConcreteIterator<E> implements Iterator<E> {

	private ConcreteAggregate<E> aggregate;// �������ľۼ�

	private int cursor = 0;// �α�

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