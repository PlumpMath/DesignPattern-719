/**
 * 
 */
package pattern.Interpreter.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境类
 * <p>
 * 环境(Context)角色
 * <p>
 * 提供解释器之外的一些全局信息，比如变量的真实值等。
 * <p>
 * 定义出从变量到布尔值(true和false)的一个映射。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-20
 */
public class Context {

	private Map<Variable, Boolean> variable_value_map;

	/**
	 * 给变量赋值
	 * 
	 * @param variable
	 *            变量
	 * @param value
	 *            值
	 */
	public void assign(Variable variable, boolean value) {
		getMap().put(variable, value);
	}

	/**
	 * 查找变量对应的boolean值
	 * 
	 * @param variable
	 */
	public boolean lookup(Variable variable) {
		Boolean value = getMap().get(variable);
		if (value == null) {
			throw new IllegalArgumentException("Cannot find variable value.");
		}
		return value.booleanValue();
	}

	private Map<Variable, Boolean> getMap() {
		if (variable_value_map == null) {
			variable_value_map = new HashMap<Variable, Boolean>();
		}
		return variable_value_map;
	}
}
