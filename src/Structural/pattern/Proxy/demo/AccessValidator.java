package pattern.Proxy.demo;

/**
 * ���ʿ���У����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-23
 */
public class AccessValidator {

    /**
	 * У���û��Ƿ���Ȩ��
	 * 
	 * @param userid
	 *            �û�id
	 */
	public boolean validateUser(String userid) {
		return userid != null && userid.toLowerCase().startsWith("admin");
	}
}