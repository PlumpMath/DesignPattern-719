/**
 * 
 */
package pattern.Mediator.demo2.after;

/**
 * �����ͣ��
 * <p>
 * �����ͣ�߽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-8
 */
public interface IMediator {

	/**
	 * �ĸ��¼�����������������֮��Ĺ�ϵ
	 */

	/**
	 * ֪ͨ�ɹ���ɹ�����
	 */
	public void buyComputer(int number);

	/**
	 * ֪ͨ���������۵���
	 */
	public void sellComputer(int number);

	/**
	 * ֪ͨ�������ۼ�����
	 */
	public void offSell();

	/**
	 * ֪ͨ�������ִ���
	 */
	public void clearStock();
}