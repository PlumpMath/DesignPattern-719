/**
 * 
 */
package pattern.Flyweight.demo1;

/**
 * ���ݿ����ӽӿ�
 * <p>
 * ������Ԫ��ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-8-3
 */
public interface DBConnection {

	/**
	 * ���ӵ�ָ�����ݿ�
	 */
	public void connect(String address);

	/**
	 * �ͷ�����
	 */
	public void release();
}