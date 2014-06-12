/**
 * 
 */
package pattern.Memento.doubleitf;


/**
 * 可以使用ConcreteClass对象宽接口的类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-7-15
 */
public class User {

	private ConcreteClass cclass = new ConcreteClass();

	public INarrow getNarrow() {
		return cclass;
	}

	public void operation() {
		// 这里可以访问ConcreteClass特有的public方法
		cclass.operation1();
		cclass.operation2();
	}
}