/**
 * 
 */
package pattern.FactoryMethod.demo;

/**
 * ����԰����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-24
 */
public class GrapeGardener implements FruitGardener {

	/**
	 * ��������
	 */
	public Fruit factory() {
		return new Grape();
	}
}