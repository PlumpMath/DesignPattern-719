/**
 * 
 */
package pattern.Bridge;

/**
 * 具体实现化角色
 * <p>
 * 这个角色给出实现化角色接口的具体实现。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-26
 */
public class ConcreteImplementorA implements Implementor {

	@Override
	public void operationImpl() {
		System.out.println("ConcreteImplementorA.operationImpl()");
	}
}
