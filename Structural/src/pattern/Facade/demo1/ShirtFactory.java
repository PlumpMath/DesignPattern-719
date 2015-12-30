/**
 * 
 */
package pattern.Facade.demo1;

/**
 * Shirt工厂
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-26
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
