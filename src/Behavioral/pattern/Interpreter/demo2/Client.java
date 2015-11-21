/**
 * 
 */
package pattern.Interpreter.demo2;

/**
 * 客户端类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-11
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 8+5*2-6/4 = 16.5
		Expression exp = new ExpressionParser().parse("8+5*2-6/4");
		System.out.println(exp.toString() + "=" + exp.interpret());
	}
}
