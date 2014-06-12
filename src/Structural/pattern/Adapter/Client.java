/**
 * 
 */
package pattern.Adapter;

/**
 * �ͻ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-4
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Target target = new ClassAdapter();
		operation(target);
		target = new ObjectAdapter(new Adaptee());
		operation(target);
	}

	private static void operation(Target target) {
		target.operation1();
		target.operation2();
	}
}