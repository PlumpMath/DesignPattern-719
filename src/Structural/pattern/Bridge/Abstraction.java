/**
 * 
 */
package pattern.Bridge;

/**
 * 抽象化角色
 * <p>
 * 抽象化给出的定义，并保存一个对实现化对象的引用。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-26
 */
public abstract class Abstraction {
	
	// 实现化对象
	private Implementor implementor;

	public Abstraction(Implementor implementor) {
		this.implementor = implementor;
	}

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}

	private Implementor getImplementor() {
		return implementor;
	}

	/**
	 * 某个业务方法，需要委派给实现化对象
	 */
	public void operation() {
		getImplementor().operationImpl();
	}
	
	/**
	 * 某个业务方法，独立实现，不需要实现化对象的参与
	 * <p>
	 * 一般而言，实现化角色中的每一个方法都应当有一个抽象化角色中的某一个方法与之相对应，
	 * 但是，反过来则不一定。换言之，抽象化角色的接口比实现化角色的接口宽。
	 * 抽象化角色除了提供与实现化角色相关的方法之外，还有可能提供其他的商业方法；
	 * 而实现化角色则往往仅为实现抽象角色的相关行为而存在。
	 */
	public void printOperation(){
		System.out.println("Abstraction.printOperation()");
	}
}