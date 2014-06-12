/**
 * 
 */
package pattern.Facade.demo1;

/**
 * Jacket工厂
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-26
 */
public class JacketFactory {

	public static Jacket create() {
		return new Jacket();
	}

	public static class Jacket {

		private Jacket() {
			System.out.println("Jacket");
		}
	}
}