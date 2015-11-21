/**
 * 
 */
package pattern.Strategy;

/**
 * 具体策略A
 * <p>
 * 包装了相关的具体算法或行为
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-30
 */
public class ConcreteStrategyA implements Strategy {

	public void strategyOperation() {
		System.out.println("ConcreteStrategyA.strategyOperation()");
	}
}
