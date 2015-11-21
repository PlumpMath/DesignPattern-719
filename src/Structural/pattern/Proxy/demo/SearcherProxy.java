/**
 * 
 */
package pattern.Proxy.demo;

/**
 * 搜索器代理
 * <p>
 * 为搜索器增加了权限验证(保护访问代理的应用)和日志记录功能(智能引用代理的应用)。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-23
 */
public class SearcherProxy implements Searcher {

	private Searcher realSearcher;

	public SearcherProxy() {
		// do nothing
	}

	@Override
	public String doSearch(String userid, String keyword) throws Exception {
		// 校验权限
		if (checkAccess(userid)) {
			String result = getRealSearcher().doSearch(userid, keyword);
			logUsage(userid);// 记录日志
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
