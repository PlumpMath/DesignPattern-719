/**
 * 
 */
package pattern.Proxy.demo;

/**
 * ������������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-23
 */
public class RealSearcher implements Searcher {

	public RealSearcher() {
		// do nothing
	}

	@Override
	public String doSearch(String userid, String keyword) {
		return "search result:" + userid + " finds where " + keyword + " is.\n";
	}
}