/**
 * 
 */
package pattern.Prototype;

/**
 * ����ԭ�ͽ�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-3-28
 */
public class ConcretePrototypeB implements Prototype {

	/**
	 * ���� new һ���¶���ķ�ʽʵ�ֿ�¡
	 */
	public Object clone(){
		return new ConcretePrototypeB();
	}
}