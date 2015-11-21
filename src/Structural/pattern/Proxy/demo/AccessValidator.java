package pattern.Proxy.demo;

/**
 * 访问控制校验器
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-23
 */
public class AccessValidator {

    /**
	 * 校验用户是否有权限
	 * 
	 * @param userid
	 *            用户id
	 */
	public boolean validateUser(String userid) {
		return userid != null && userid.toLowerCase().startsWith("admin");
	}
}
