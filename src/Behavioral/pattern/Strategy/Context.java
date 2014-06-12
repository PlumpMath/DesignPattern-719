/**
 * 
 */
package pattern.Strategy;

/**
 * 环境角色
 * <p>
 * 持有一个Strategy对象的引用
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-30
 */
public class Context {

	private Strategy strategy;// Strategy对象

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
	 * 为环境设置新的策略
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * 环境角色对外提供的操作
	 */
	public void contextOperation() {
		System.out.println("Context.contextOperation()");
		getStrategy().strategyOperation();
	}

	/**
	 * 默认策略
	 */
	private static class DefaultStrategy implements Strategy {

		public void strategyOperation() {
			System.out.println("DefaultStrategy.strategyOperation()");
		}
	}
}