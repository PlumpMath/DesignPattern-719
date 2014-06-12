/**
 * 
 */
package pattern.Iterator.extrinsic;

/**
 * 客户端
 * <p>
 * 客户端角色
 * 持有对聚集及其迭代子对象的引用，调用迭代子对象的迭代接口，
 * 也有可能通过迭代子操作聚集元素的增加和删除。
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
		// 使用for循环方式遍历聚集
		System.out.println("iterate by for style");
		for (int i = 0; i < agg.size(); i++) {
			System.out.print(agg.get(i) + ",");
		}
		System.out.println();
		// 使用迭代子方式遍历聚集
		System.out.println("iterate by Iterator style");
		Iterator<String> it = agg.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + ",");
		}
	}
}