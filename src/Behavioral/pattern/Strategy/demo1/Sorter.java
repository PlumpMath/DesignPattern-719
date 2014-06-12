/**
 * 
 */
package pattern.Strategy.demo1;

/**
 * ������
 * <p>
 * ������ɫ��ֻ�ʺ����������������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-30
 */
public class Sorter {

	// �������
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
	 * �����������
	 */
	public void setStrategy(SortStrategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * �����������������
	 * 
	 * @param array
	 *            ��������
	 */
	public void sort(int[] array) {
		getStrategy().sort(array);
	}
}