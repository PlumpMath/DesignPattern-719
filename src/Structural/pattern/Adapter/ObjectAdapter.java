/**
 * 
 */
package pattern.Adapter;

/**
 * ��������ɫ
 * <p>
 * �������������������ģʽ�ĺ���
 * ��������Դ�ӿ�ת����Ŀ��ӿ�
 * ��һ��ɫ�������ǽӿڣ��������Ǿ�����
 * <p>
 * �����������ģʽһ���������������ģʽ�ѱ���������APIת����ΪĿ�����API��
 * ���䲻ͬ���ǣ���ģʽ����ʹ�ü̳й�ϵ����ʹ��ί�ɹ�ϵ���ӵ�Adaptee�ࡣ
 * Adaptee�ಢû��Target�ӿ���������Щ���������ͻ������ڴ���Щ������
 * Ϊʹ�ͻ����ܹ�ʹ��Adaptee�࣬��Ҫ�ṩһ����װ��ObjectAdapter��
 * �����װ���װ��һ��Adaptee��ʵ�����Ӷ��˰�װ���ܹ���Adaptee��API��Target��API�ν�������
 * Adapter��Adaptee��ί�ɹ�ϵ������������������ģʽ�Ƕ���ġ�
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-4-4
 */
public class ObjectAdapter implements Target {

	private Adaptee adaptee;// ������Ķ���ʵ��
	
	public ObjectAdapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	public void operation1() {
		adaptee.operation();
	}

	public void operation2() {
		adaptee.operation();
	}
}