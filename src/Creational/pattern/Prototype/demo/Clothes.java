/**
 * 
 */
package pattern.Prototype.demo;

/**
 * �·��ӿ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-28
 */
public interface Clothes extends Cloneable {

	/**
	 * ��ɫ
	 */
	public String getColor();
	
	/**
	 * �ߴ�
	 */
	public int getSize();
	
	/**
	 * ��¡
	 */
	public Clothes clone();
}