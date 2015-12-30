/**
 * 
 */
package pattern.Bridge;

/**
 * 实现化角色
 * <p>
 * 这个角色给出了实现化角色的接口，但不给出具体的实现。
 * 这个接口不一定和抽象化角色的接口定义相同，它们可以完全不同。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-26
 */
public interface Implementor {

	/**
	 * 某个业务方法
	 */
	public void operationImpl();
}
