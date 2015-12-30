/**
 * 
 */
package pattern.State;

/**
 * 客户端类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-24
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context context = new Context();
		context.setState(new ConcreteStateA(context));
		context.operation();
		context.operation();
		context.operation();
		context.operation();
	}
}
