/**
 * 
 */
package pattern.Mediator.more;

/**
 * ��ͣ�߽ӿ�
 * <p>
 * 3���Ƿ�ʹ�ó����ͣ��
 * ����ǳ��϶������ͣ�߽�ɫֻ��һ���Ļ�������ʡ�Գ����ͣ���ࡣ
 * ���ͬʱ���ڶ�������ͣ�߽�ɫ�Ļ���
 * ���п��ܻ�����Щ�����ͣ�߽�ɫ�з��ֹ�ͬ�Ĵ��롣
 * ��������Ҫһ����ͬ�����ͣ������ظ��Ĵ����ƶ���������ȥ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-6-9
 */
public interface Mediator {

	/**
	 * ͬ�¶���״̬�仯
	 * 
	 * @param clolleague
	 *            ͬ�¶���
	 */
	public void colleagueChanged(Colleague clolleague);
}