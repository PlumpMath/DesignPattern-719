/**
 * 
 */
package pattern.Iterator.demo;

/**
 * ��ǰ���������ӽӿ�
 * <p>
 * ��������ӽ�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-14
 */
public interface ForwardIterator<E> {

	/**
	 * �ж��Ƿ���δ������Ԫ��
	 */
	public boolean hasPrevious();
	
	/**
	 * ����ǰһ����������Ԫ��
	 */
	public E previous();
}