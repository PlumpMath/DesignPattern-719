/**
 * 
 */
package pattern.Interpreter.demo2;

/**
 * �ͻ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-11
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