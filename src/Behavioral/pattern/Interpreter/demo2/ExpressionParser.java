/**
 * 
 */
package pattern.Interpreter.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * 表达式解析器
 * <p>
 * 用于将String解析成对应的Expression对象
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-20
 */
public class ExpressionParser {

	/**
	 * 将String解析成对应的Expression对象
	 */
	public Expression parse(String expression) {
		char[] chars = expression.toCharArray();
		List<Expression> numbers = new ArrayList<Expression>();
		List<String> operators = new ArrayList<String>();
		for (int i = 0; i < chars.length; i++) {
			if (i % 2 == 0) {
				numbers.add(new Number(Integer.parseInt(String
						.valueOf(chars[i]))));
			} else {
				operators.add(String.valueOf(chars[i]));
			}
		}
		for (int i = 0; i < operators.size(); i++) {
			if (operators.get(i).equals("*")) {
				Expression mul = new MulExpression(numbers.get(i), numbers.get(i + 1));
				numbers.set(i, mul);
				numbers.set(i + 1, null);
				operators.set(i, null);
			} else if (operators.get(i).equals("/")) {
				Expression div = new DivExpression(numbers.get(i), numbers.get(i + 1));
				numbers.set(i, div);
				numbers.set(i + 1, null);
				operators.set(i, null);
			}
		}
		numbers = clearNull(numbers);
		operators = clearNull(operators);
		for (int i = 0; i < operators.size(); i++) {
			if (operators.get(i).equals("+")) {
				Expression add = new AddExpression(numbers.get(i), numbers.get(i + 1));
				numbers.set(i + 1, add);
			} else if (operators.get(i).equals("-")) {
				Expression sub = new SubExpression(numbers.get(i), numbers.get(i + 1));
				numbers.set(i + 1, sub);
			}
		}
		return numbers.get(numbers.size() - 1);
	}

	private static <T> List<T> clearNull(List<T> list) {
		List<T> newList = new ArrayList<T>();
		for (T t : list) {
			if (t != null) {
				newList.add(t);
			}
		}
		return newList;
	}
}