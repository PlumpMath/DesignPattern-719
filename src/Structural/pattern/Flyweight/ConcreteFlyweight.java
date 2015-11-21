/**
 * 
 */
package pattern.Flyweight;

/**
 * 具体享元(ConcreteFlyweight)角色
 * <p>
 * 实现抽象享元角色所规定的接口。如果有内蕴状态的话，必须负责为内蕴状态提供存储空间。
 * 享元对象的内蕴状态必须与对象所处的周围环境无关，从而使得享元对象可以在系统内共享的。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-8-2
 */
public class ConcreteFlyweight extends Flyweight {

	// 这是一个Character类型的内蕴状态，模式对内蕴状态的类型并没有限制
	private Character intrinsicState;

	/**
	 * 构造方法是包级私有，不允许外界直接创建享元对象，必须通过享元工厂获取享元对象
	 */
	ConcreteFlyweight(Character intrinsicState) {
		// 内蕴状态的值应当在享元对象被创建时赋予
		// 所有的内蕴状态在对象创建之后，就不会再改变了
		this.intrinsicState = intrinsicState;
	}

	/**
	 * 如果一个享元对象有外蕴状态的话，所有的外部状态都必须存储在客户端。
	 * 在使用享元对象时，再由客户端传给享元对象。
	 *
	 * @see pattern.Flyweight.Flyweight#operation(java.lang.String)
	 */
	public void operation(String state) {
		System.out.print("Intrinsic State=" + intrinsicState);
		System.out.println(",Extrinsic State=" + state);
	}
}
