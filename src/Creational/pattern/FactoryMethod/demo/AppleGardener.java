/**
 * 
 */
package pattern.FactoryMethod.demo;

/**
 * ƻ��԰����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-24
 */
public class AppleGardener implements FruitGardener {

	/**
	 * ����ƻ��
	 */
	public Fruit factory() {
		return new Apple();
	}
}