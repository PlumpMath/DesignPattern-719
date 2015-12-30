/**
 * 
 */
package pattern.Iterator.demo;

/**
 * 客户端
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-5-14
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IQueue<String> queue = new Queue<String>();
		queue.add("0");
		queue.add("1");
		queue.add("2");
		queue.add("3");
		queue.add("4");
		queue.add("5");
		// 正向遍历
		BackwardIterator<String> it = queue.backwardIterator();
		while (it.hasNext()) {
			System.out.print(it.next());
			System.out.print(",");
		}
		System.out.println();
		// 逆向遍历
		ForwardIterator<String> it2 = queue.forwardIterator();
		while (it2.hasPrevious()) {
			System.out.print(it2.previous());
			System.out.print(",");
		}
	}
}
