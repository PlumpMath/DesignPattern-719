/**
 * 
 */
package pattern.Strategy.demo1;

/**
 * 排序策略接口
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-30
 */
public interface SortStrategy {

	/**
	 * 对参数数组进行排序
	 * 
	 * @param array
	 *            整数数组
	 */
	public void sort(int[] array);
}
