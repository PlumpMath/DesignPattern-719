/**
 * 
 */
package pattern.ChainOfResponsibility.demo1;

/**
 * 董事长
 * <p>
 * 具体处理者角色
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-1
 */
public class Chairman extends Handler {

	public Chairman() {
		super(null);
	}

	/**
	 * 董事长能处理所有事务
	 * 
	 * @see pattern.ChainOfResponsibility.demo1.Handler#handleRequest(pattern.ChainOfResponsibility.demo1.Request)
	 */
	@Override
	public void handleRequest(Request request) {
		System.out.println("董事长 批准 " + request.getDescription());
	}
}