/**
 * 
 */
package pattern.Strategy.demo1;

/**
 * 选择排序策略
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-30
 */
public class SelectionSortStrategy extends AbstractSortStrategy {

	@Override
	public void sort(int[] array) {
		selectionSort(array);
	}

	/**
	 * 选择排序
	 * <p>
	 * 算法描述： 
	 * 首先找出最大元素，把它移动到a[n-1] 
	 * 然后在余下的n-1个元素中寻找最大的元素把它移动到a[n-2] 
	 * 如此进行下去... ...
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
