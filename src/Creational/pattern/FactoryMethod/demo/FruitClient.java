/**
 * 
 */
package pattern.FactoryMethod.demo;

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
		Fruit grape = new GrapeGardener().factory();
		Fruit apple = new AppleGardener().factory();
		Fruit strawberry = new StrawberryGardener().factory();
	}
}