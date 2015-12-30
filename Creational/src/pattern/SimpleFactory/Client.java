/**
 * 
 */
package pattern.SimpleFactory;

/**
 * 客户端程序类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-2-24
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Product product = Factory.create();
		System.out.println(product);
	}
}
