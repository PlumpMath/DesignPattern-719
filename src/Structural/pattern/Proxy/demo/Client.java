/**
 * 
 */
package pattern.Proxy.demo;

/**
 * �ͻ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-23
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