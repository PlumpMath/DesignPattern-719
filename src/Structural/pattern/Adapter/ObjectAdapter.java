/**
 * 
 */
package pattern.Adapter;

/**
 * 适配器角色
 * <p>
 * 与类的适配器模式一样，对象的适配器模式把被适配的类的API转换成为目标类的API。
 * 与其不同的是，本模式不是使用继承关系而是使用组合连接到Adaptee类。
 * Adaptee类并没有Target接口声明的那些方法，而客户端则期待这些方法。为使客户端能够使用Adaptee类，需要提供一个包装类ObjectAdapter。
 * 这个包装类包装了一个Adaptee的实例，从而此包装类能够把Adaptee的API与Target的API衔接起来。
 * Adapter与Adaptee是委派关系，这决定了这个适配器模式是对象的。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-4
 */
public class ObjectAdapter implements Target {

	private Adaptee adaptee;// 被适配的对象实例
	
	public ObjectAdapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	public void operation1() {
		adaptee.operation();
	}

	public void operation2() {
		adaptee.operation();
	}
}