/**
 * 
 */
package pattern.Mediator.demo3.after;

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
	 * ��ͣ������Ҫ�ķ����������¼�����������������֮��Ĺ�ϵ
	 * 
	 * @param command
	 *            ����
	 * @param number
	 *            ����
	 */
	public void execute(String command, int number);
}