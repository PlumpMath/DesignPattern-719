/**
 * 
 */
package pattern.FactoryMethod.demo;

/**
 * ��ݮ԰����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-24
 */
public class StrawberryGardener implements FruitGardener {

	/**
	 * ������ݮ
	 */
	public Fruit factory() {
		return new Strawberry();
	}
}