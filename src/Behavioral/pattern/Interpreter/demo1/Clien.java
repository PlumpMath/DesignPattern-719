/**
 * 
 */
package pattern.Interpreter.demo1;

/**
 * 客户端(Client)角色
 * <p>
 * 代表模式的客户端，它有以下功能：
 * 建造一个抽象语法树(Abstract Syntax Tree)
 * 调用解释操作interpret()
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-20
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