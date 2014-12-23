/**
 * 
 */
package pattern.Iterator.extrinsic;

/**
 * �ۼ��ӿ�
 * <p>
 * �ۼ�(Aggregate)��ɫ���˽�ɫ�����˴��������Ӷ���Ľӿڡ�
 * <p>
 * ���ǰ׺оۼ���ʾ���ӿڣ��׺оۼ�������ṩ�����Լ����ڲ�Ԫ�صĽӿ�(��get()����)��
 * �Ӷ�ʹ���������ӿ���ͨ���ۼ��ı�������ʵ�ֵ������ܡ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-17
 */
public interface Aggregate<T> {

	/**
	 * ����һ��Ԫ��
	 */
	public void add(T t);

	/**
	 * ɾ��ָ��Ԫ��
	 */
	public void remove(T t);

	/**
	 * ���ؾۼ�Ԫ����
	 */
	public int size();

	/**
	 * ����ָ����������Ԫ��
	 */
	public T get(int index);

	/**
	 * ����һ��������
	 */
	public Iterator<T> iterator();
}