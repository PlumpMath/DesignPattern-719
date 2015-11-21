/**
 * 
 */
package pattern.ChainOfResponsibility.demo;

/**
 * CEO
 * <p>
 * 具体处理者角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-1
 */
public class CEO extends Handler {

	public CEO(Handler nextHandler) {
		super(nextHandler);
	}

	/**
	 * CEO只能处理晋升事务，其他的事务交给下家(上级领导)处理
	 * 
	 * @see pattern.ChainOfResponsibility.demo.Handler#handleRequest(pattern.ChainOfResponsibility.demo.Request)
	 */
	@Override
	public void handleRequest(Request request) {
		if (request == Request.PROMOTION) {
			System.out.println("CEO 批准 " + request.getDescription());
		} else {
			getNextHandler().handleRequest(request);
		}
	}
}
