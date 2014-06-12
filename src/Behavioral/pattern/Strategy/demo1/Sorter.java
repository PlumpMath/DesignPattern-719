/**
 * 
 */
package pattern.Strategy.demo1;

/**
 * 排序器
 * <p>
 * 环境角色，只适合于整数数组的排序。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-30
 */
public class Sorter {

	// 排序策略
	private SortStrategy strategy;

	public Sorter() {
		this.strategy = new SelectionSortStrategy();
	}

	public Sorter(SortStrategy strategy) {
		this.strategy = strategy;
	}

	public SortStrategy getStrategy() {
		return strategy;
	}

	/**
	 * 设置排序策略
	 */
	public void setStrategy(SortStrategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * 对整数数组进行排序
	 * 
	 * @param array
	 *            整数数组
	 */
	public void sort(int[] array) {
		getStrategy().sort(array);
	}
}