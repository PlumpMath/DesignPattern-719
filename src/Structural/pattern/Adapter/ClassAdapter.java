/**
 * 
 */
package pattern.Adapter;

/**
 * ��������ɫ
 * <p>
 * ��������Դ�ӿ�ת����Ŀ��ӿڣ���һ��ɫ�������ǽӿڣ��������Ǿ�����
 * <p>
 * ���������ģʽ�ѱ���������APIת����ΪĿ�����API��
 * Adaptee�ಢû��Target�ӿ���������Щ���������ͻ������ڴ���Щ������
 * Ϊʹ�ͻ����ܹ�ʹ��Adaptee�࣬�ṩһ���м价�ڣ�����ClassAdapter����Adaptee��API��Target��API�ν�������
 * Adapter��Adaptee�Ǽ̳й�ϵ������������������ģʽ�ǻ�����ġ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-4
 */
public class ClassAdapter extends Adaptee implements Target {

	public void operation1() {
		operation();
	}

	public void operation2() {
		operation();
	}
}