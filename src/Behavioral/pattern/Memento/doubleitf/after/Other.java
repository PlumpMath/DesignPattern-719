/**
 * 
 */
package pattern.Memento.doubleitf.after;

import pattern.Memento.doubleitf.INarrow;

/**
 * 理论上只可以使用ConcreteClass对象窄接口的类
 * 也就是只知道INarrow对象而不知道ConcreteClass对象
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-15
 */
public class Other {

	private INarrow narrow;

	public INarrow getNarrow() {
		return narrow;
	}

	public void setNarrow(INarrow narrow) {
		this.narrow = narrow;
	}

	public void operation() {
		System.out.println("I cannot access narrow.");
		// 这时就不能够强制类型转换为ConcreteClass了
//		ConcreteClass cclass = (ConcreteClass)getNarrow();
//		cclass.operation1();
//		cclass.operation2();
	}
}