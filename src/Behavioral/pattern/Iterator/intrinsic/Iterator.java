/**
 * 
 */
package pattern.Iterator.intrinsic;

/**
 * ������
 * <p>
 * ���������(Iterator)��ɫ���˽�ɫ���������Ԫ������Ľӿڡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-17
 */
public interface Iterator<E> {

	/**
	 * �Ƿ���δ������Ԫ��
	 */
	public boolean hasNext();
	
	/**
	 * ������һ��Ԫ��
	 */
	public E next();
}