/**
 * 
 */
package pattern.Proxy.demo;

/**
 * �������ӿ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-23
 */
public interface Searcher {

	/**
	 * ����Ϊָ���û������ؼ�����ƥ�������
	 * 
	 * @param userid
	 *            �û�id
	 * @param keyword
	 *            �ؼ���
	 * @throws Exception
	 */
	public String doSearch(String userid, String keyword) throws Exception;
}