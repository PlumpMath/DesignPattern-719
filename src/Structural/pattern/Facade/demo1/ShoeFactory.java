/**
 * 
 */
package pattern.Facade.demo1;

/**
 * Shoe����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-26
 */
public class ShoeFactory {

	public static Shoe create() {
		return new Shoe();
	}

	public static class Shoe {

		private Shoe() {
			System.out.println("Shoe");
		}
	}
}