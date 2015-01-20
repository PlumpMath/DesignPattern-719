/**
 * 
 */
package pattern.ChainOfResponsibility.demo;

/**
 * 总经理
 * <p>
 * 具体处理者角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-1
 */
public class GeneralManager extends Handler {

	public GeneralManager(Handler nextHandler) {
		super(nextHandler);
	}

	/**
	 * 总经理只能处理加薪事务，其他的事务交给下家(上级领导)处理
	 * 
	 * @see pattern.ChainOfResponsibility.demo.Handler#handleRequest(pattern.ChainOfResponsibility.demo.Request)
	 */
	@Override
	public void handleRequest(Request request) {
		if (request == Request.RAISES) {
			System.out.println("总经理 批准 " + request.getDescription());
		} else {
			getNextHandler().handleRequest(request);
		}
	}
}