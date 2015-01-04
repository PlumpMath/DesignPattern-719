/**
 * 
 */
package pattern.Proxy.demo;

/**
 * ����������
 * <p>
 * Ϊ������������Ȩ����֤(�������ʴ����Ӧ��)����־��¼����(�������ô����Ӧ��)��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-23
 */
public class SearcherProxy implements Searcher {

	private Searcher realSearcher;

	public SearcherProxy() {
		// do nothing
	}

	@Override
	public String doSearch(String userid, String keyword) throws Exception {
		// У��Ȩ��
		if (checkAccess(userid)) {
			String result = getRealSearcher().doSearch(userid, keyword);
			logUsage(userid);// ��¼��־
			return result;
		}
		throw new UnauthorizationException(userid);
	}

	private boolean checkAccess(String userid) {
		return new AccessValidator().validateUser(userid);
	}

	private void logUsage(String userid) {
		new UsageLogger(userid).log();
	}

	private Searcher getRealSearcher() {
		if (realSearcher == null) {
			realSearcher = new RealSearcher();
		}
		return realSearcher;
	}
}