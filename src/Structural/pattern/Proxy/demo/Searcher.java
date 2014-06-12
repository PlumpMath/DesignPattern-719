/**
 * 
 */
package pattern.Proxy.demo;

/**
 * 搜索器接口
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-23
 */
public interface Searcher {

	/**
	 * 返回为指定用户搜索关键字所匹配的内容
	 * 
	 * @param userid
	 *            用户id
	 * @param keyword
	 *            关键字
	 * @throws Exception
	 */
	public String doSearch(String userid, String keyword) throws Exception;
}