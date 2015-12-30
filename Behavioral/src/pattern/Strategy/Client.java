/**
 * 
 */
package pattern.Strategy;

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
		// 由客户端根据自己需要决定使用哪个策略
		Context context = new Context();
		context.contextOperation();
		// 替换默认策略
		context.setStrategy(new ConcreteStrategyA());
		context.contextOperation();
		// 使用另一个策略
		context.setStrategy(new ConcreteStrategyB());
		context.contextOperation();
	}
}
