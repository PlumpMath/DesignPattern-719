/**
 * 
 */
package pattern.Prototype;

/**
 * 具体原型(Concrete Prototype)角色
 * <p>
 * 被复制的对象。此角色需要实现抽象原型角色所要求的接口。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-28
 */
public class ConcretePrototypeA implements Prototype {

	/**
	 * 采用Object类中的clone()方法来实现对象克隆
	 * <p>
	 * Object类中的clone()实际上是浅克隆，即：
	 * 被克隆对象的所有变量都含有与原来的对象相同的值，而所有的对其他对象的引用都仍然指向原来的对象。
	 * 换言之，浅克隆仅仅复制所考虑的对象，而不复制它所引用的对象。
	 * <p>
	 * 深克隆：
	 * 被克隆对象的所有的变量都含有与原来的对象相同的值，除去那些引用其他对象的变量。
	 * 那些引用其他对象的变量将指向被克隆过的新对象，而不再是原有的那些被引用的对象。
	 * 换言之，深克隆把要克隆的对象所引用的对象都克隆了一遍，而这种对被引用到的对象的克隆叫做间接克隆。
	 * 
	 * 深克隆要深入到多少层，是一个不易确定的问题。
	 * 在决定以深克隆的方式克隆一个对象的时候，必须决定对间接克隆的对象是采取浅克隆还是继续采取深克隆。
	 * 此外，在深克隆的过程中，很可能会出现循环引用的问题，必须小心处理。
	 */
	public Object clone() {
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return object;
	}
}