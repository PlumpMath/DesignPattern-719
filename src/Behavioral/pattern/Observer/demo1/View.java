/**
 * 
 */
package pattern.Observer.demo1;

/**
 * ��ͼ�ӿ�
 * <p>
 * �۲��߽�ɫ
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-5-10
 */
public interface View {

	/**
	 * ����Model�����Լ�
	 * <p>
	 * ���۲�����֪ͨ�۲��߸����Լ���ʱ�򣬿����Բ����ķ�ʽ
	 * �����۲��߶��󴫵ݸ��۲��߶���ʹ�����㹻����Ϣ�����²���
	 * 
	 * @param model
	 *            ������ģ��
	 */
	public void update(Model model);
}