/**
 * 
 */
package pattern.Composite.demo3;

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
		Expression mul = new MulOperator(new Number(5),new Number(2));
		Expression div = new DivOperator(new Number(6),new Number(4));
		Expression sub = new SubOperator(mul,div);
		Expression add = new AddOperator(new Number(8),sub);

		calculate(add);
	}

	private static void calculate(Expression exp) {
		System.out.println(exp.toString() + "=" + exp.getResult());
	}
}