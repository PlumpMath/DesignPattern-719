/**
 * 
 */
package pattern.Observer.demo2;

/**
 * �¼�Դ
 * <p>
 * ���۲��߽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-10
 */
public interface Source {

	/**
	 * ��Ӽ�����
	 */
	public void addListener(Listener l);

	/**
	 * ɾ��������
	 */
	public void removeListener(Listener l);

	/**
	 * ���¼�֪ͨ������
	 * 
	 * @param event
	 *            �¼�
	 */
	public void fireEvent(Event event);
}