/**
 * 
 */
package pattern.Interpreter.demo1;

/**
 * �ͻ���(Client)��ɫ
 * <p>
 * ����ģʽ�Ŀͻ��ˣ��������¹��ܣ�
 * ����һ�������﷨��(Abstract Syntax Tree)
 * ���ý��Ͳ���interpret()
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-7-20
 */
public class Clien {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context context = new Context();
		Constant c = new Constant(true);
		Variable x = new Variable("x");
		Variable y = new Variable("y");
		context.assign(x, false);
		context.assign(y, true);
		Expression exp = new Or(new And(c, x), new And(y, new Not(x)));
		System.out.println("x=" + x.interpret(context));
		System.out.println("y=" + y.interpret(context));
		System.out.println(exp.toString() + "=" + exp.interpret(context));
	}
}