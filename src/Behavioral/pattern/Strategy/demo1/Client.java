/**
 * 
 */
package pattern.Strategy.demo1;

/**
 * 客户端
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-30
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("SelectionSortStrategy");
		sort(new SelectionSortStrategy());
		System.out.println("BubbleSortStrategy");
		sort(new BubbleSortStrategy());
		System.out.println("InsertionSortStrategy");
		sort(new InsertionSortStrategy());
	}

	private static void sort(SortStrategy strategy) {
		int[] array = { 2, 5, 3, 9, 1, 3, 8, 7 };
		Sorter sorter = new Sorter(strategy);
		sorter.sort(array);
		for (int i : array) {
			System.out.print(i + ",");
		}
		System.out.println();
	}
}