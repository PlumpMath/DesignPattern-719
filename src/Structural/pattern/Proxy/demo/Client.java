/**
 * 
 */
package pattern.Proxy.demo;

/**
 * 客户端
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-23
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Searcher searcher = new SearcherProxy();
			System.out.println(searcher.doSearch("admin_a", "hello"));
			System.out.println(searcher.doSearch("admin_b", "world"));
			System.out.println(searcher.doSearch("admin_b", "city"));
			System.out.println(searcher.doSearch("admin_b", "bank"));
			System.out.println(searcher.doSearch("admin_a", "what"));
			System.out.println(searcher.doSearch("customer", "hello"));
			System.out.println(searcher.doSearch(null, "hello"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
