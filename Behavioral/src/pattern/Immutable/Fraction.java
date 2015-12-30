/**
 * 
 */
package pattern.Immutable;

/**
 * 分数类
 * <p>
 * 强不变模式
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-4-29
 */
public final class Fraction implements Cloneable {

	private static final String LINE = "/";

	private int numerator;// 分子
	private int denominator;// 分母

	/**
	 * 创建分数
	 * 
	 * @param numerator
	 *            分子
	 * @param denominator
	 *            分母
	 */
	public Fraction(int numerator, int denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException("分母不能为0.");
		}
		this.numerator = numerator;
		this.denominator = denominator;
	}

	/**
	 * 分子
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * 分母
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * 分数的小数值
	 */
	public double doubleValue() {
		return numerator / (double) denominator;
	}

	/**
	 * 加法
	 */
	public Fraction add(Fraction f) {
		int newNumerator = numerator * f.getDenominator() + f.getNumerator() * denominator;
		int newDenominator = f.getDenominator() * denominator;
		return new Fraction(newNumerator, newDenominator).division();
	}

	/**
	 * 减法
	 */
	public Fraction sub(Fraction f) {
		int newNumerator = numerator * f.getDenominator() - f.getNumerator() * denominator;
		int newDenominator = f.getDenominator() * denominator;
		return new Fraction(newNumerator, newDenominator).division();
	}

	/**
	 * 乘法
	 */
	public Fraction mul(Fraction f) {
		int newNumerator = f.getNumerator() * numerator;
		int newDenominator = f.getDenominator() * denominator;
		return new Fraction(newNumerator, newDenominator).division();
	}

	/**
	 * 除法
	 */
	public Fraction div(Fraction f) {
		return this.mul(f.reciprocal());// 乘以倒数
	}

	/**
	 * 倒数
	 */
	public Fraction reciprocal() {
		if (numerator == 0) {
			return null;
		}
		return new Fraction(denominator, numerator);
	}

	/**
	 * 约分
	 */
	public Fraction division() {
		int gcd = findGreatestCommonDivisor();
		return new Fraction(numerator / gcd, denominator / gcd);
	}

	/**
	 * 查找分子分母的最大公约数
	 */
	private int findGreatestCommonDivisor() {
		return greatestCommonDivisor(Math.abs(numerator), Math.abs(denominator));
	}

	/**
	 * 返回正整数a、b的最大公约数
	 * <p>
	 * 基于欧几里得定理: gcd(a,b) = gcd(b,a-b) 其中 a > b 
	 * 递归实现
	 * 
	 * @param a
	 *            正整数
	 * @param b
	 *            正整数
	 */
	private static int greatestCommonDivisor(int a, int b) {
		if (a == b) return a;
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		return greatestCommonDivisor(min, max - min);
	}

	@Override
	public Object clone() {
		return new Fraction(numerator, denominator);
	}

	@Override
	public String toString() {
		return numerator + LINE + denominator;
	}
}
