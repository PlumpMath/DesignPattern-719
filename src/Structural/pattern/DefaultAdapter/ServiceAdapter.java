/**
 * 
 */
package pattern.DefaultAdapter;

/**
 * 缺省适配器
 * <p>
 * 抽象适配器类ServiceAdapter为Service接口的三个方法提供了平庸的实现，因此任何继承自
 * 本抽象类的具体类都可以选择它所需要的方法实现，而不必理会其他的不需要的方法。
 * <p>
 * 缺省适配模式的中心是一个缺省适配类，这个类应当是抽象类。因为这个类不应当实例化，实例化它也没有任何用处。
 * 但是该类应当实现接口中的所有方法，而不是抽象的方法。按照模式的用意，这些方法之所以存在就是为了提供默认实现，
 * 以便缺省适配器类的具体子类可以按照需要只实现感兴趣的方法，忽略不感兴趣的方法。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-5
 */
public abstract class ServiceAdapter implements Service {

	public int operation1() {
		return 0;
	}

	public String operation2() {
		return null;
	}

	public void operation3() {
	}
}