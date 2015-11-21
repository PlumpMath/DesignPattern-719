/**
 * 
 */
package pattern.Prototype;

/**
 * 具体原型角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-28
 */
public class ConcretePrototypeB implements Prototype {

	/**
	 * 采用 new 一个新对象的方式实现克隆
	 */
	public Object clone(){
		return new ConcretePrototypeB();
	}
}
