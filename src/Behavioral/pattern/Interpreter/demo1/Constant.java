/**
 * 
 */
package pattern.Interpreter.demo1;

/**
 * 布尔常量类
 * <p>
 * 终结符表达式(Terminal Expression)角色
 * <p>
 * 这是一个具体角色。实现了抽象表达式角色所要求的接口，主要是一个interpret()方法；
 * 文法中的每一个终结符都有一个具体终结表达式与之相对应。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-20
 */
public class Constant extends Expression {

	private boolean value;

	/**
	 * 使用布尔值创建boolean常量对象
	 */
	public Constant(boolean value) {
		this.value = value;
	}

	@Override
	public boolean interpret(Context context) {
		return value;
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof Constant) {
			return ((Constant) object).value == this.value;
		}
		return false;
	}

	@Override
	public String toString() {
		return new Boolean(value).toString();
	}
}