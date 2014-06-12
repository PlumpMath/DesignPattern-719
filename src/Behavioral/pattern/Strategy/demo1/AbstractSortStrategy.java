/**
 * 
 */
package pattern.Strategy.demo1;

/**
 * ����������Ի���
 * <p>
 * ʵ���Ͻ�����Ϊ���ṩһ�����õ�swap������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-30
 */
public abstract class AbstractSortStrategy implements SortStrategy {

	/**
	 * ��������������������������Ԫ��
	 * 
	 * @param array
	 *            ��������
	 * @param x
	 *            ������Ԫ������
	 * @param y
	 *            ������Ԫ������
	 */
	protected void swap(int[] array, int x, int y) {
		if (x == y) return;
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
}