/**
 * 
 */
package pattern.SimpleFactory.demo;

/**
 * ԰����
 * <p>
 * ʵ������ˮ���Ĵ���������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-3
 */
public class FruitGardener {

	/**
	 * ���ݿͻ���Ҫ������ָ��ˮ��
	 * 
	 * @param which
	 *            ˮ����
	 * @throws BadFruitException
	 */
	public static Fruit factory(String which) throws BadFruitException {
		if ("grape".equals(which)) {
			return new Grape();
		} else if ("apple".equals(which)) {
			return new Apple();
		} else if ("strawberry".equals(which)) {
			return new Strawberry();
		} else {
			throw new BadFruitException("Bad Fruit Request.");
		}
	}
}