/**
 * 
 */
package pattern.Interpreter.demo1;

/**
 * 布尔表达式抽象基类
 * <p>
 * 抽象表达式(Expression)角色
 * <p>
 * 声明一个所有的具体表达式角色都需要实现的抽象接口。
 * 这个抽象类代表终结类和非终结类的抽象化。
 * 这个接口主要是一个interpret()方法，称作解释操作。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-20
 */
public abstract class Expression {

	/**
	 * 以环境类为依据解释表达式
	 * 
	 * @param context
	 *            环境类
	 */
	public abstract boolean interpret(Context context);

	public abstract boolean equals(Object object);

	public abstract String toString();
}