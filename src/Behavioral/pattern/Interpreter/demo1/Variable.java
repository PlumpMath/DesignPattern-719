/**
 * 
 */
package pattern.Interpreter.demo1;

/**
 * boolean变量类
 * <p>
 * 终结符表达式(Terminal Expression)角色
 * <p>
 * 每个对象都有一个变量名，对应的boolean值保存在环境对象(Context)里
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-20
 */
public class Variable extends Expression {

	private String name;// 变量名
	
	public Variable(String name) {
		this.name = name;
	}

	@Override
	public boolean interpret(Context context) {
		return context.lookup(this);
	}

	@Override
	public boolean equals(Object object) {
		if(object instanceof Variable){
			return ((Variable)object).name.equals(this.name);
		}
		return false;
	}

	@Override
	public String toString() {
		return name;
	}
}