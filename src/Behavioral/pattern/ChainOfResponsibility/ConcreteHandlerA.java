/**
 * 
 */
package pattern.ChainOfResponsibility;

/**
 * 具体处理者(ConcreteHandler)角色
 * <p>
 * 具体处理者接到请求后，可以选择将请求处理掉，或者将请求传给下家。
 * 由于具体处理者持有对下家的引用，因此，如果需要，具体处理者可以访问下家。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-1
 */
public class ConcreteHandlerA extends Handler {

	/**
	 * 如果有下家就传递给下家处理，否则自己处理
	 *
	 * @see pattern.ChainOfResponsibility.Handler#handleRequest()
	 */
	@Override
	public void handleRequest() {
		if (getNext() == null) {
			System.out.println("The request is handled in ConcreteHandlerA.");
		} else {
			System.out.println("The request is passed to next Handler.");
			getNext().handleRequest();
		}
	}
}