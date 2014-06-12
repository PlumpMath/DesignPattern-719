/**
 * 
 */
package pattern.Strategy.demo1;

/**
 * 冒泡排序策略
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-30
 */
public class BubbleSortStrategy extends AbstractSortStrategy {

	@Override
	public void sort(int[] array) {
		bubbleSortPrivate(array);
	}

	/**
	 * 冒泡排序
	 * <p>
	 * 算法描述：
	 * 对相邻的元素进行比较，如果左边的元素大于右边的元素则交换这两个元素
	 * 在一次冒泡过程结束后，可以确信最大的元素肯定在最右边的位置上
	 * 然后对剩下的元素在进行冒泡，如此进行下去... ...
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