/**
 * 
 */
package pattern.Iterator.demo;

/**
 * �����������ӽӿ�
 * <p>
 * ��������ӽ�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-14
 */
public interface BackwardIterator<E> {

	/**
	 * �ж��Ƿ���δ������Ԫ��
	 */
	public boolean hasNext();
	
	/**
	 * ���غ�һ����������Ԫ��
	 */
	public E next();
}
