/**
 * 
 */
package pattern.Iterator.demo;

/**
 * ���нӿ�
 * <p>
 * ����ۼ���ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-14
 */
public interface IQueue<T> {

	/**
	 * ����һ��Ԫ��
	 */
	public void add(T t);

	/**
	 * ɾ��һ��Ԫ��
	 */
	public void remove(T t);

	/**
	 * ����Ԫ����
	 */
	public int size();

	/**
	 * ����һ����ǰ�����ĵ�����
	 */
	public ForwardIterator<T> forwardIterator();

	/**
	 * ����һ���������ĵ�����
	 */
	public BackwardIterator<T> backwardIterator();
}