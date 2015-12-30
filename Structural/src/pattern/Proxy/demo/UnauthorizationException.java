/**
 * 
 */
package pattern.Proxy.demo;

/**
 * 未授权异常
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-23
 */
public class UnauthorizationException extends Exception {

	private static final long serialVersionUID = 1L;

	private String userID;

	public UnauthorizationException(String userID) {
		this.userID = userID;
	}

	@Override
	public String getMessage() {
		return "用户 " + userID + " 未被授权.";
	}
}
