/**
 * 
 */
package pattern.Strategy.demo1;

/**
 * 抽象排序策略基类
 * <p>
 * 实际上仅仅是为了提供一个公用的swap方法。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-30
 */
public abstract class AbstractSortStrategy implements SortStrategy {

	/**
	 * 交换参数数组中两个索引处的元素
	 * 
	 * @param array
	 *            参数数组
	 * @param x
	 *            待交换元素索引
	 * @param y
	 *            待交换元素索引
	 */
	protected void swap(int[] array, int x, int y) {
		if (x == y) return;
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
}