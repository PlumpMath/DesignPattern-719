/**
 * 
 */
package pattern.Bridge;

/**
 * 具体实现化角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-26
 */
public class ConcreteImplementorB implements Implementor {

	@Override
	public void operationImpl() {
		System.out.println("ConcreteImplementorB.operationImpl()");
	}
}