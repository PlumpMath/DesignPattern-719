/**
 * 
 */
package pattern.Strategy.demo1;

/**
 * 插入排序策略
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-30
 */
public class InsertionSortStrategy extends AbstractSortStrategy {

	@Override
	public void sort(int[] array) {
		insertionSort(array);
	}

	/**
	 * 插入排序
	 * <p>
	 * 算法描述：
	 * 因为只有一个元素的数组是一个有序数组，所以可以从仅包含欲排序的n个元素的第一个元素的数组开始
	 * 通过把第二个元素插入到这个单元数组中，可以得到一个大小为2的有序数组
	 * 插入第三个元素可以得到一个大小为3的有序数组，如此进行下去...
	 * 最终得到一个大小为n的有序数组
	 */
	private void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j;
			// 边查找待插入位置边将比temp大的元素向后移一位
			for (j = i - 1; j >= 0 && temp < array[j]; j--) {
				array[j + 1] = array[j];
			}
			array[j + 1] = temp;
		}
	}
}
