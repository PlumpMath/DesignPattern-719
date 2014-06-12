/**
 * 
 */
package pattern.Multiton;

import java.util.Random;

/**
 * 有上限多例类
 * <p>
 * 一个实例数目有上限的多例类已经把实例的上限当做逻辑的一部分，
 * 并放到了多例类的内部，这种多例模式叫做有上限多例模式。
 * <p>
 * 一个有上限的多例类可以使用静态变量存储所有的实例，
 * 特别是在实例数目不多的时候，可以使用一个个的静态变量存储一个个的实例，
 * 在数目较多的时候，就需要使用静态聚集存储这些实例。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-3-11
 */
public class LimitedMultiton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("The first die = " + Die.getInstance(1).dice());
		System.out.println("The second die = " + Die.getInstance(2).dice());
	}
}

/**
 * 骰子类
 * <p>
 * 一副麻将只能有两个骰子，所以骰子类是有两个实例的多例类
 */
class Die {

	private static Die die1 = new Die();
	private static Die die2 = new Die();

	private Die() {
	}

	/**
	 * 返回指定骰子
	 */
	public static Die getInstance(int number) {
		if (number == 1) {
			return die1;
		} else {
			return die2;
		}
	}

	/**
	 * 投掷骰子
	 */
	public int dice() {
		Random random = new Random();
		return random.nextInt(7);
	}
}