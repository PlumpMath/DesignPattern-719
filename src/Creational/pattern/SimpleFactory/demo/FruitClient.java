/**
 * 
 */
package pattern.SimpleFactory.demo;

/**
 * ����ˮ���Ŀͻ�����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-3
 */
public class FruitClient {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			Fruit grape = FruitGardener.factory("grape");
			Fruit apple = FruitGardener.factory("apple");
			Fruit strawberry = FruitGardener.factory("strawberry");
			Fruit banana = FruitGardener.factory("banana");
		} catch (BadFruitException e) {
			e.printStackTrace();
		}
	}
}