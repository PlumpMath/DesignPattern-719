/**
 * 
 */
package pattern.Flyweight;

/**
 * ������Ԫ(Flyweight)��ɫ
 * <p>
 * �˽�ɫ�����еľ�����Ԫ��ĳ��࣬Ϊ��Щ��涨����Ҫʵ�ֵĹ����ӿڡ�
 * ��Щ��Ҫ����״̬(External State)�Ĳ�������ͨ��������ҵ�����Բ�����ʽ���롣
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-8-2
 */
public abstract class Flyweight {

	/**
	 * һ��ʾ���Եķ���������state������״̬
	 * 
	 * @param state
	 */
	public abstract void operation(String state);
}