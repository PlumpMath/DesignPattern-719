/**
 * 
 */
package pattern.Adapter;

/**
 * 适配器角色
 * <p>
 * 适配器把源接口转换成目标接口，这一角色不可以是接口，而必须是具体类
 * <p>
 * 类的适配器模式把被适配的类的API转换成为目标类的API。
 * Adaptee类并没有Target接口声明的那些方法，而客户端则期待这些方法。
 * 为使客户端能够使用Adaptee类，提供一个中间环节，即类ClassAdapter，把Adaptee的API和Target的API衔接起来。
 * Adapter与Adaptee是继承关系，这决定了这个适配器模式是基于类的。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-4
 */
public class ClassAdapter extends Adaptee implements Target {

	public void operation1() {
		operation();
	}

	public void operation2() {
		operation();
	}
}