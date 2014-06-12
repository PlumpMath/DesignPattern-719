/**
 * 
 */
package pattern.Strategy.demo1;

/**
 * �����������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-30
 */
public class InsertionSortStrategy extends AbstractSortStrategy {

	@Override
	public void sort(int[] array) {
		insertionSort(array);
	}

	/**
	 * ��������
	 * <p>
	 * �㷨������
	 * ��Ϊֻ��һ��Ԫ�ص�������һ���������飬���Կ��Դӽ������������n��Ԫ�صĵ�һ��Ԫ�ص����鿪ʼ
	 * ͨ���ѵڶ���Ԫ�ز��뵽�����Ԫ�����У����Եõ�һ����СΪ2����������
	 * ���������Ԫ�ؿ��Եõ�һ����СΪ3���������飬��˽�����ȥ...
	 * ���յõ�һ����СΪn����������
	 */
	private void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j;
			// �߲��Ҵ�����λ�ñ߽���temp���Ԫ�������һλ
			for (j = i - 1; j >= 0 && temp < array[j]; j--) {
				array[j + 1] = array[j];
			}
			array[j + 1] = temp;
		}
	}
}