/**
 * 
 */
package pattern.Proxy.demo;

/**
 * δ��Ȩ�쳣
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-23
 */
public class UnauthorizationException extends Exception {

	private static final long serialVersionUID = 1L;

	private String userID;

	public UnauthorizationException(String userID) {
		this.userID = userID;
	}

	@Override
	public String getMessage() {
		return "�û� " + userID + " δ����Ȩ.";
	}
}