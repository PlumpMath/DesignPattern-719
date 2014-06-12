/**
 * 
 */
package pattern.Memento.doubleitf;


/**
 * 具体实现类
 * <p>
 * 目的是对User类提供宽接口，对Other类提供窄接口
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-15
 */
public class ConcreteClass implements INarrow {

	/**
	 * 本方法是ConcreteClass类特有的
	 */
	public void operation1() {
		System.out.println("operation1");
	}

	/**
	 * 本方法是ConcreteClass类特有的
	 */
	public void operation2() {
		System.out.println("operation2");
	}
}