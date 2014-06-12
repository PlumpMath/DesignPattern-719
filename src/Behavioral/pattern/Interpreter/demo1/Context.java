/**
 * 
 */
package pattern.Interpreter.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * ������
 * <p>
 * ����(Context)��ɫ
 * <p>
 * �ṩ������֮���һЩȫ����Ϣ�������������ʵֵ�ȡ�
 * <p>
 * ������ӱ���������ֵ(true��false)��һ��ӳ�䡣
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-7-20
 */
public class Context {

	private Map<Variable, Boolean> variable_value_map;

	/**
	 * ��������ֵ
	 * 
	 * @param variable
	 *            ����
	 * @param value
	 *            ֵ
	 */
	public void assign(Variable variable, boolean value) {
		getMap().put(variable, value);
	}

	/**
	 * ���ұ�����Ӧ��booleanֵ
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