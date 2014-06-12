/**
 * 
 */
package pattern.Memento.doubleitf.after;

import pattern.Memento.doubleitf.INarrow;

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

	public void operation(){
		cclass.operation1();
		cclass.operation2();
	}
	
	/**
	 * 具体实现类
	 * <p>
	 * 目的是对User类提供宽接口，对Other类提供窄接口
	 * <p>
	 * 采用内部类实现，并且方法的访问控制都是private
	 * 这样就保证了外界不能访问它的宽接口，只有User类可以访问其宽接口
	 */
	private static class ConcreteClass implements INarrow {

		private void operation1() {
			System.out.println("operation1");
		}

		private void operation2() {
			System.out.println("operation2");
		}
	}
}