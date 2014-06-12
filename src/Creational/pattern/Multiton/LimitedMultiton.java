/**
 * 
 */
package pattern.Multiton;

import java.util.Random;

/**
 * �����޶�����
 * <p>
 * һ��ʵ����Ŀ�����޵Ķ������Ѿ���ʵ�������޵����߼���һ���֣�
 * ���ŵ��˶�������ڲ������ֶ���ģʽ���������޶���ģʽ��
 * <p>
 * һ�������޵Ķ��������ʹ�þ�̬�����洢���е�ʵ����
 * �ر�����ʵ����Ŀ�����ʱ�򣬿���ʹ��һ�����ľ�̬�����洢һ������ʵ����
 * ����Ŀ�϶��ʱ�򣬾���Ҫʹ�þ�̬�ۼ��洢��Щʵ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-11
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
 * ������
 * <p>
 * һ���齫ֻ�����������ӣ�������������������ʵ���Ķ�����
 */
class Die {

	private static Die die1 = new Die();
	private static Die die2 = new Die();

	private Die() {
	}

	/**
	 * ����ָ������
	 */
	public static Die getInstance(int number) {
		if (number == 1) {
			return die1;
		} else {
			return die2;
		}
	}

	/**
	 * Ͷ������
	 */
	public int dice() {
		Random random = new Random();
		return random.nextInt(7);
	}
}