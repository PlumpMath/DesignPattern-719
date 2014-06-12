/**
 * 
 */
package pattern.Facade.demo1;

/**
 * Shirt����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-26
 */
public class ShirtFactory {

	public static Shirt create() {
		return new Shirt();
	}

	public static class Shirt {

		private Shirt() {
			System.out.println("Shirt");
		}
	}
}