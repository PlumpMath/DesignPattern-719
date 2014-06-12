/**
 * 
 */
package pattern.Immutable;

/**
 * 分数客户端
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-29
 */
public class FractionClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fraction f1 = new Fraction(2, 3);
		Fraction f2 = new Fraction(7, 9);
		System.out.println(f1 + " + " + f2 + "=" + f1.add(f2));
		System.out.println(f1 + " - " + f2 + "=" + f1.sub(f2));
		System.out.println(f1 + " * " + f2 + "=" + f1.mul(f2));
		System.out.println(f1 + " / " + f2 + "=" + f1.div(f2));
	}
}