/**
 * 
 */
package pattern.Strategy.demo1;

/**
 * ð���������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-30
 */
public class BubbleSortStrategy extends AbstractSortStrategy {

	@Override
	public void sort(int[] array) {
		bubbleSortPrivate(array);
	}

	/**
	 * ð������
	 * <p>
	 * �㷨������
	 * �����ڵ�Ԫ�ؽ��бȽϣ������ߵ�Ԫ�ش����ұߵ�Ԫ���򽻻�������Ԫ��
	 * ��һ��ð�ݹ��̽����󣬿���ȷ������Ԫ�ؿ϶������ұߵ�λ����
	 * Ȼ���ʣ�µ�Ԫ���ڽ���ð�ݣ���˽�����ȥ... ...
	 */
	private void bubbleSortPrivate(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
				}
			}
		}
	}
}