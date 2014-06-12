/**
 * 
 */
package pattern.Immutable;

/**
 * ������
 * <p>
 * ǿ����ģʽ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-29
 */
public final class Fraction implements Cloneable {

	private static final String LINE = "/";

	private int numerator;// ����
	private int denominator;// ��ĸ

	/**
	 * ��������
	 * 
	 * @param numerator
	 *            ����
	 * @param denominator
	 *            ��ĸ
	 */
	public Fraction(int numerator, int denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException("��ĸ����Ϊ0.");
		}
		this.numerator = numerator;
		this.denominator = denominator;
	}

	/**
	 * ����
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * ��ĸ
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * ������С��ֵ
	 */
	public double doubleValue() {
		return numerator / (double) denominator;
	}

	/**
	 * �ӷ�
	 */
	public Fraction add(Fraction f) {
		int newNumerator = numerator * f.getDenominator() + f.getNumerator() * denominator;
		int newDenominator = f.getDenominator() * denominator;
		return new Fraction(newNumerator, newDenominator).division();
	}

	/**
	 * ����
	 */
	public Fraction sub(Fraction f) {
		int newNumerator = numerator * f.getDenominator() - f.getNumerator() * denominator;
		int newDenominator = f.getDenominator() * denominator;
		return new Fraction(newNumerator, newDenominator).division();
	}

	/**
	 * �˷�
	 */
	public Fraction mul(Fraction f) {
		int newNumerator = f.getNumerator() * numerator;
		int newDenominator = f.getDenominator() * denominator;
		return new Fraction(newNumerator, newDenominator).division();
	}

	/**
	 * ����
	 */
	public Fraction div(Fraction f) {
		return this.mul(f.reciprocal());// ���Ե���
	}

	/**
	 * ����
	 */
	public Fraction reciprocal() {
		if (numerator == 0) {
			return null;
		}
		return new Fraction(denominator, numerator);
	}

	/**
	 * Լ��
	 */
	public Fraction division() {
		int gcd = findGreatestCommonDivisor();
		return new Fraction(numerator / gcd, denominator / gcd);
	}

	/**
	 * ���ҷ��ӷ�ĸ�����Լ��
	 */
	private int findGreatestCommonDivisor() {
		return greatestCommonDivisor(Math.abs(numerator), Math.abs(denominator));
	}

	/**
	 * ����������a��b�����Լ��
	 * <p>
	 * ����ŷ����ö���: gcd(a,b) = gcd(b,a-b) ���� a > b 
	 * �ݹ�ʵ��
	 * 
	 * @param a
	 *            ������
	 * @param b
	 *            ������
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