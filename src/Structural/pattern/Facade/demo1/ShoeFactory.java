/**
 * 
 */
package pattern.Facade.demo1;

/**
 * Shoe工厂
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-26
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