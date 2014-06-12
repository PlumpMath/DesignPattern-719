/**
 * 
 */
package pattern.Iterator.intrinsic;

/**
 * 客户端
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-17
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 创建聚集对象并对其进行操作
		Aggregate<String> agg = new ConcreteAggregate<String>();
		agg.add("0");
		agg.add("1");
		agg.add("2");
		agg.add("3");
		agg.add("4");
		// 黑盒聚集就无法使用下面的方式进行遍历了
//		// 使用for循环方式遍历聚集
//		System.out.println("iterate by for style");
//		for (int i = 0; i < agg.size(); i++) {
//			System.out.print(agg.get(i) + ",");
//		}
		// 使用迭代子方式遍历聚集
		System.out.println("iterate by Iterator style");
		Iterator<String> it = agg.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + ",");
		}
	}
}