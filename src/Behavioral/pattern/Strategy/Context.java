/**
 * 
 */
package pattern.Strategy;

/**
 * ������ɫ
 * <p>
 * ����һ��Strategy���������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-30
 */
public class Context {

	private Strategy strategy;// Strategy����

	public Context() {
	}

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public Strategy getStrategy() {
		if (strategy == null) {
			strategy = new DefaultStrategy();
		}
		return strategy;
	}

	/**
	 * Ϊ���������µĲ���
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * ������ɫ�����ṩ�Ĳ���
	 */
	public void contextOperation() {
		System.out.println("Context.contextOperation()");
		getStrategy().strategyOperation();
	}

	/**
	 * Ĭ�ϲ���
	 */
	private static class DefaultStrategy implements Strategy {

		public void strategyOperation() {
			System.out.println("DefaultStrategy.strategyOperation()");
		}
	}
}