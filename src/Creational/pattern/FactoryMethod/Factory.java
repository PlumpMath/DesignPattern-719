/**
 * 
 */
package pattern.FactoryMethod;

/**
 * ���󹤳��ӿ�
 * <p>
 * ������ǹ�������ģʽ�ĺ��ģ�������Ӧ�ó����޹ص�
 * �κ���ģʽ�д�������Ĺ��������ʵ������ӿ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-2-3
 */
public interface Factory {

	/**
	 * ����Product��ʵ��
	 */
	public Product create();
}