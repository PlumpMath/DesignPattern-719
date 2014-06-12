/**
 * 
 */
package pattern.Strategy.demo1;

/**
 * ѡ���������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-30
 */
public class SelectionSortStrategy extends AbstractSortStrategy {

	@Override
	public void sort(int[] array) {
		selectionSort(array);
	}

	/**
	 * ѡ������
	 * <p>
	 * �㷨������ 
	 * �����ҳ����Ԫ�أ������ƶ���a[n-1] 
	 * Ȼ�������µ�n-1��Ԫ����Ѱ������Ԫ�ذ����ƶ���a[n-2] 
	 * ��˽�����ȥ... ...
	 */
	private void selectionSort(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			int index = 0;
			for (int j = 0; j <= i; j++) {
				if (array[j] > array[index]) {
					index = j;
				}
			}
			swap(array, i, index);
		}
	}
}