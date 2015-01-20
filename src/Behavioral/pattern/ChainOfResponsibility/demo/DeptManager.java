/**
 * 
 */
package pattern.ChainOfResponsibility.demo;

/**
 * 部门经理
 * <p>
 * 具体处理者角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-1
 */
public class DeptManager extends Handler {

	public DeptManager(Handler nextHandler) {
		super(nextHandler);
	}

	/**
	 * 部门经理只能处理请假事务，其他的事务交给下家(上级领导)处理
	 * 
	 * @see pattern.ChainOfResponsibility.demo.Handler#handleRequest(pattern.ChainOfResponsibility.demo.Request)
	 */
	@Override
	public void handleRequest(Request request) {
		if (request == Request.LEAVE) {
			System.out.println("部门经理 批准 " + request.getDescription());
		} else {
			getNextHandler().handleRequest(request);
		}
	}
}