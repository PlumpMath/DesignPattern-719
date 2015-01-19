/**
 * 
 */
package pattern.Bridge;

/**
 * 修正抽象化角色
 * <p>
 * 扩展抽象化角色，改变和修正父类对抽象化的定义。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-26
 */
public class RefinedAbstraction extends Abstraction {

	public RefinedAbstraction(Implementor implementor) {
		super(implementor);
	}

	/**
	 * 改变(修正)了这个业务方法的定义
	 * <p>
	 * 在很多情况下，修正抽象化角色没有"修正"抽象化角色的行为，这是允许的。
	 */
	public void operation() {
		System.out.println("RefinedAbstraction.operation()");
		super.operation();
	}
}