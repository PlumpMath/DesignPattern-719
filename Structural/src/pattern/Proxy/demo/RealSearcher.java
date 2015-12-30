/**
 * 
 */
package pattern.Proxy.demo;

/**
 * 真正的搜索器
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-23
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
