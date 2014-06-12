/**
 * 
 */
package pattern.Memento.doubleitf;


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
		// 这里可以通过强制类型转换来访问ConcreteClass的宽接口
		// 所以ConcreteClass类没有达到对User类提供宽接口对Other类提供窄接口的目的
		ConcreteClass cclass = (ConcreteClass) getNarrow();
		cclass.operation1();
		cclass.operation2();
	}
}