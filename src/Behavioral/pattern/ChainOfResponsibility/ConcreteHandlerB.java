/**
 * 
 */
package pattern.ChainOfResponsibility;

/**
 * 具体处理者(ConcreteHandler)角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-1
 */
public class ConcreteHandlerB extends Handler {

	/**
	 * 如果有下家就传递给下家处理，否则自己处理
	 * 
	 * @see pattern.ChainOfResponsibility.Handler#handleRequest()
	 */
	@Override
	public void handleRequest() {
		if (getNext() == null) {
			System.out.println("The request is handled in ConcreteHandlerB.");
		} else {
			System.out.println("The request is passed to next Handler.");
			getNext().handleRequest();
		}
	}
}