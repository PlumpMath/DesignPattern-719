/**
 * 
 */
package pattern.Composite.demo2;

/**
 * �ͻ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-11
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Directory sonDir = new Directory();
		sonDir.add(new File());
		sonDir.add(new File());
		Directory dir = new Directory();
		dir.add(new File());
		dir.add(new File());
		dir.add(sonDir);
		dir.info();
	}
}