/**
 * 
 */
package pattern.Iterator.intrinsic;

/**
 * �ۼ��ӿ�
 * <p>
 * �ۼ�(Aggregate)��ɫ���˽�ɫ�����˴��������Ӷ���Ľӿڡ�
 * <p>
 * ���Ǻںоۼ���ʾ���ӿڣ���Ϊ�����ṩ��ȡԪ�ص�get()������
 * �ںоۼ���������ṩ�����Լ����ڲ�Ԫ�صĽӿ�(��get()����)��
 * �����ЩԪ�ض���ֻ���Ա��ۼ��ڲ���Ա���ʣ����Ե���������Ҫ�����ھۼ��ڲ���
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
	 * ����һ��������
	 */
	public Iterator<T> iterator();
}