/**
 * 
 */
package pattern.FactoryMethod.demo;

/**
 * ����԰���ӿ�
 * <p>
 * ���ǹ�������ģʽ�ĺ��ģ���������������ˮ�������ɱ��Ȩ
 * �෴������Ȩ���������������࣬��ʵ���������о���԰��(����)��ɫ�ĳ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-3
 */
public interface FruitGardener {

	/**
	 * ����ˮ��
	 */
	public Fruit factory();
}